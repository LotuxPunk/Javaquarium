package com.vandendaelen.living;

import com.vandendaelen.container.Aquarium;
import com.vandendaelen.living.vegetal.Plant;

public class Living {
    private String specie;
    private int healthPoints;
    private int age;

    public Living(String specie, int healthPoints, int age) {
        this.specie = specie;
        this.healthPoints = healthPoints;
        this.age = age;
    }

    public void lives(){
        this.age++;
        if (age > 20){
            if (this instanceof Plant)
                Aquarium.removeFish(Aquarium.plants.indexOf(this));
            else
                Aquarium.removePlant(Aquarium.plants.indexOf(this));
        }
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getSpecie() {
        return specie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
}
