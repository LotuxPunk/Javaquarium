package com.vandendaelen.living.fish;

import com.vandendaelen.container.Aquarium;
import com.vandendaelen.living.Living;

import java.util.EmptyStackException;
import java.util.Random;

public abstract class Fish extends Living {
    private String name;
    private double size;
    private double weight;
    private char sex;
    private boolean isCarnivore;

    public Fish(String specie,int age, String name, double size, double weight, char sex, boolean isCarnivore) {
        super(specie, 10, age);
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.sex = sex;
        this.isCarnivore = isCarnivore;
        Aquarium.addFish(this);
    }

    public void attacked(){
        this.setHealthPoints(this.getHealthPoints() - 4);
        checkHP();
    }

    public void eat(){
        Random accessMemories = new Random(); //MDR, t'as vu la vanne ? Daft Punk toussa toussa.
        if(isCarnivore){
            if (Aquarium.fishes.size() == 1)
                throw new EmptyStackException();
            int idVictim = accessMemories.nextInt(Aquarium.fishes.size());
            while (Aquarium.fishes.get(idVictim) == this){
                idVictim = accessMemories.nextInt(Aquarium.fishes.size());
            }
            Aquarium.fishes.get(idVictim).attacked();
            this.setHealthPoints(this.getHealthPoints() + 5);
            if (this.getHealthPoints() > 10)
                this.setHealthPoints(10);
        }
        else {
            if (Aquarium.plants.size() == 0)
                throw new EmptyStackException();
            int idVictim = accessMemories.nextInt(Aquarium.plants.size());
            Aquarium.plants.get(idVictim).consumed();
            this.setHealthPoints(this.getHealthPoints() + 3);
        }
    }

    @Override
    public void lives(){
        super.lives();
        //I'm hungry
        this.setHealthPoints(this.getHealthPoints() - 1);
        checkHP();

        //Miam time
        if (this.getHealthPoints() <= 5){
            this.eat();
        }
        else {
            this.reproduction();
        }
    }

    public abstract void reproduction();

    public void checkHP(){
        if(this.getHealthPoints() <= 0)
            Aquarium.removeFish(Aquarium.fishes.indexOf(this));
    }

    public void switchSex(){
        if (sex == 'm'){
            sex = 'f';
        }
        else{
            sex = 'm';
        }
    }

    public char getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }
}
