package com.wildcodeschool.projectEMA.Entity;

public class Location {
    
    private Integer id;
    private String name;
    private String type;
    private String dimension;
    private String[] residents;
    private String url;
    private String created;

    public Location() {
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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDimension() {
        return this.dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String[] getResidents() {
        return this.residents;
    }

    public void setResidents(String[] residents) {
        this.residents = residents;
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