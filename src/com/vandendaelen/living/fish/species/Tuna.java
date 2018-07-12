package com.vandendaelen.living.fish.species;


import com.vandendaelen.living.fish.FishSingleSex;

public class Tuna extends FishSingleSex {

    public Tuna(int age, String name, double size, double weight, char sex) {
        super("Tuna", age, name, size, weight, sex, true);
    }
}
