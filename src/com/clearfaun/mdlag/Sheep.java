package com.clearfaun.mdlag;

/**
 * Created by SpencerDepas on 6/14/16.
 */
public class Sheep extends Animal {

    //concrete prototype
    //
    //


    private Animal animal = new Animal();

    public Sheep(String name){
        animal.setType("Sheep");
        animal.setName(name);
        System.out.println("tt");
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }



    @Override
    public Animal clone()
            throws CloneNotSupportedException {
        Sheep clone = (Sheep)super.clone();
        clone.setAnimal(clone.getAnimal().clone());
        return clone;
    }
}