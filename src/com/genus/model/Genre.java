package com.genus.model;

public class Genre {

    private String type;
    private String subType;

    public Genre() { }

    public Genre(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }
    public void setSubType(String subType) {
        this.subType = subType;
    }
}
