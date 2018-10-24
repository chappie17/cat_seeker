package com.sdaacademy;


public class Cat {

    private String name;
    private String race;

    public Cat(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Cat " +
                "name = '" + name + '\'' +
                ", race = '" + race + '\'';
    }
}
