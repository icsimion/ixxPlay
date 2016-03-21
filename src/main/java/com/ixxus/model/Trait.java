package com.ixxus.model;

/**
 * Created by simion on 22/03/2016.
 */
public class Trait {
    private String name;
    private String description;

    public Trait(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
