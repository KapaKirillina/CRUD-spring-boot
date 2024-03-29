package com.example.project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, announce, full_text;
    private int views;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAnnounce() {
        return announce;
    }
    public void setAnnounce(String announce) {
        this.announce = announce;
    }
    public String getFull_text() {
        return full_text;
    }
    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

    public Post() {
    }
    
    public Post(String title, String announce, String full_text) {
        this.title = title;
        this.announce = announce;
        this.full_text = full_text;
    }

       

}
