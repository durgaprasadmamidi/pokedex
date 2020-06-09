package com.durgaprasad.pokedex;

public class Pokemon {
    private String name;
    private int id;

    public Pokemon(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
