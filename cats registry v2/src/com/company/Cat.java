package com.company;

public class Cat {

    public String name;
    public String surname;
    public String species;
    public String color;
    public String SEXXXXX;
    private int racismLevel;

    public int getRacismLevel() {
        return racismLevel;
    }

    public void setRacismLevel(int level){
        if(level >= 0 && level <= 10)
            this.racismLevel = level;
        this.racismLevel = 0;
    }

    @Override
    public String toString(){
        return this.name + " " + this.surname + " Rasa: " + this.species + " KOLOR: "+ this.color + " SEX: "+ this.SEXXXXX + " Racism level: " + this.racismLevel;
    }

    public Cat(String name, String surname, String species, String color, String SEXXXXX, int racismLevel) {
        this.name = name;
        this.surname = surname;
        this.species = species;
        this.color = color;
        this.SEXXXXX = SEXXXXX;
        setRacismLevel(racismLevel);
    }
}
