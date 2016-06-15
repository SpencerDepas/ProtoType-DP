package com.clearfaun.mdlag;

/**
 * Created by SpencerDepas on 6/14/16.
 */
public class Sheep implements Prototype<Sheep> {

    private Animal animal = new Animal();

    public Sheep(){
        animal.setType("Sheep");

    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }



    @Override
    public Sheep clone()
            throws CloneNotSupportedException {
        Sheep clone = (Sheep)super.clone();
        clone.setAnimal(clone.getAnimal().clone());
        return clone;
    }
}