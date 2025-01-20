/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jirkniv.dsList.services;

import com.jirkniv.dsList.dto.GameMinDTO;
import com.jirkniv.dsList.entities.Game;
import com.jirkniv.dsList.repositories.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    
    @Autowired
    public GameRepository gameRepository;
    
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        
        return dto;
    }
    
}
