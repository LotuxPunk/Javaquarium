package com.vandendaelen.living.fish;

import com.vandendaelen.container.Aquarium;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class FishSingleSex extends  Fish {

    public FishSingleSex(String specie, int age, String name, double size, double weight, char sex, boolean isCarnivore) {
        super(specie, age, name, size, weight, sex, isCarnivore);
    }

    @Override
    public void reproduction() {
        Random accessMemories = new Random(); //MDR, t'as vu la vanne ? Daft Punk toussa toussa.
        int idVictim = accessMemories.nextInt(Aquarium.fishes.size());
        while (Aquarium.fishes.get(idVictim) == this){
            idVictim = accessMemories.nextInt(Aquarium.fishes.size());
        }

        if (this.getSpecie().equals(Aquarium.fishes.get(idVictim).getSpecie())){
            if (this.getSex() != Aquarium.fishes.get(idVictim).getSex()){
                String name = this.getClass().getName();
                char sex = (accessMemories.nextBoolean())? 'm': 'f';
                try{
                    Class c = Class.forName(name);
                    Class[] types = new Class[]{String.class, String.class};
                    Constructor ct = c.getConstructor(types);
                    Object o2 = ct.newInstance(new String[]{this.getSpecie(), "0", this.getName() + "'s baby", ""+this.getSize(),""+this.getWeight(), ""+sex,""+this.isCarnivore()} );

                } catch (SecurityException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
