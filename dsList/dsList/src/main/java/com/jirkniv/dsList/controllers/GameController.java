/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jirkniv.dsList.controllers;


import com.jirkniv.dsList.dto.GameMinDTO;
import com.jirkniv.dsList.services.GameService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    
    @Autowired
    private GameService gameService;
    
    @GetMapping
    public List<GameMinDTO> FindAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
   
