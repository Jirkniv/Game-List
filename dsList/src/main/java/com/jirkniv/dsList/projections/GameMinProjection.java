/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jirkniv.dsList.projections;

/**
 *
 * @author 55319
 */
public interface GameMinProjection {
    
    Long getId();
    String getTitle();
    int getGameYear();
    String getImgUrl();
    String getShortDescription();
    int getPosition();
}
