package com.wildcodeschool.projectEMA.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Episode {
    
    private Integer id;
    private String name;
    @JsonProperty("air_date")
    private String airDate;
    private String episode;
    private String[] characters;
    private String url;
    private String created;

    public Episode() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirDate() {
        return this.airDate;
    }

    public void setAirDate(String airDate) {
        this.airDate = airDate;
    }

    public String getEpisode() {
        return this.episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String[] getCharacters() {
        return this.characters;
    }

    public void setCharacters(String[] characters) {
        this.characters = characters;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }    
}