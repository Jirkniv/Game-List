/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jirkniv.dsList.repositories;

import com.jirkniv.dsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository<Game, Long> {
    
}
