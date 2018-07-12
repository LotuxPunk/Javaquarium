package com.vandendaelen.living.fish.species;


import com.vandendaelen.living.fish.FishSingleSex;

public class Tuna extends FishSingleSex {

    public Tuna(String specie, int age, String name, double size, double weight, char sex, boolean isCarnivore) {
        super("Tuna", age, name, size, weight, sex, true);
    }
}
