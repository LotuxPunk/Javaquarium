package com.vandendaelen.living.fish.species;

import com.vandendaelen.living.fish.FishHermaphroditeAge;

public class Merou extends FishHermaphroditeAge {

    public Merou(String specie, int age, String name, double size, double weight, char sex, boolean isCarnivore) {
        super("Mérou", age, name, size, weight, sex, true);
    }
}
