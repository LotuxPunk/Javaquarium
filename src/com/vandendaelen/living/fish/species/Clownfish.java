package com.vandendaelen.living.fish.species;

import com.vandendaelen.living.fish.FishHermaphroditeOpp;

public class Clownfish extends FishHermaphroditeOpp {

    public Clownfish(int age, String name, double size, double weight, char sex) {
        super("Clownfish", age, name, size, weight, sex, true);
    }
}
