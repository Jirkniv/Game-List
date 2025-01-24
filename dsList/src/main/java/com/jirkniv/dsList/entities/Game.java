/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jirkniv.dsList.entities;

import jakarta.persistence.Column;
import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")

public class Game {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String title;
    
    @Column(name = "game_year")
    private int year;
    private String genre;
    private String platforms;
    private double score;
    private String imgUrl;
    
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game() {
    }

    public Game(Long id, String title, int year, String genre, String platforms, double score, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public String getGenre() {
        return genre;
    }

    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getPlatforms() {
        return platforms;
    }

    public double getScore() {
        return score;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
   
}
