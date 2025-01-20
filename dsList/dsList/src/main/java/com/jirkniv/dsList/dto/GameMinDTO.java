/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jirkniv.dsList.dto;

import com.jirkniv.dsList.entities.Game;

/**
 *
 * @author 55319
 */
public class GameMinDTO {
    private Long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Long getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDescription() {
        return shortDescription;
    }
    
  
}
