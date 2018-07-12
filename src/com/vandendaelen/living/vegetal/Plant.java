package com.vandendaelen.living.vegetal;

import com.vandendaelen.container.Aquarium;
import com.vandendaelen.living.Living;

public class Plant extends Living {

    public Plant(String specie, int age) {
        super(specie, 10, age);
        Aquarium.addPlant(this);
    }

    public void consumed(){
        this.setHealthPoints(this.getHealthPoints() - 2);
        if (this.getHealthPoints() == 0)
            Aquarium.removePlant(Aquarium.fishes.indexOf(this));
    }

    @Override
    public void lives(){
        super.lives();

        if (this.getHealthPoints() == 10) {
            this.cloning();
        }
        else {
            this.setHealthPoints(this.getHealthPoints() + 1);
        }
    }

    public void cloning(){
        new Plant(this.getSpecie(),0);
        this.setHealthPoints(5);
    }
}
