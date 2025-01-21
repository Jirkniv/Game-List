/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jirkniv.dsList.controllers;



import com.jirkniv.dsList.dto.GameListDTO;

import com.jirkniv.dsList.services.GameListService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    
    
    @Autowired
    private GameListService gameListService;

    
    @GetMapping
    public List<GameListDTO> FindAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
   
