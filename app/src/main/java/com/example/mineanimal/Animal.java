package com.example.mineanimal;

public class Animal {

    private String animalName;
    private int animalIMG;

    public Animal(String animalName, int animalIMG)
    {
        this.animalName = animalName;
        this.animalIMG = animalIMG;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalIMG() {
        return animalIMG;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalIMG(int animalIMG) {
        this.animalIMG = animalIMG;
    }
}
