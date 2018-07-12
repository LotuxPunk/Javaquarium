package com.vandendaelen.living.fish.species;

import com.vandendaelen.living.fish.FishHermaphroditeAge;

public class SeaBass extends FishHermaphroditeAge {

    public SeaBass(String specie, int age, String name, double size, double weight, char sex, boolean isCarnivore) {
        super("Sea bass", age, name, size, weight, sex, false);
    }
}
