/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jirkniv.dsList.services;

import com.jirkniv.dsList.dto.GameListDTO;
import com.jirkniv.dsList.entities.GameList;
import com.jirkniv.dsList.projections.GameMinProjection;
import com.jirkniv.dsList.repositories.GameListRepository;      
import com.jirkniv.dsList.repositories.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameListService {
    
    @Autowired
    public GameListRepository gameListRepository;
    
    @Autowired
    public GameRepository gameRepository;
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
    
    @Transactional
    public void move(long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);
        
        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
        
        for (int i = min; i <= max ; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
        return;
    }
}
