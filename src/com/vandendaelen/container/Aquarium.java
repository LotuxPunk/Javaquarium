package com.vandendaelen.container;

import com.vandendaelen.living.fish.Fish;
import com.vandendaelen.living.vegetal.Plant;

import java.util.List;

public class Aquarium {
    public static List<Fish> fishes;
    public static List<Plant> plants;

    public Aquarium() {}

    //Adding to the aquarium
    public static void addFish(Fish f){
        fishes.add(f);
    }
    public static void addPlant(Plant p){
        plants.add(p);
    }

    //Removing from the aquarium
    public static void removeFish(int id){fishes.remove(id);}
    public static void removePlant(int id){plants.remove(id);}

    public void turn(){
        for (Fish f: fishes) {
            f.lives();
        }

        for (Plant p : plants){
            p.lives();
        }
    }

}
