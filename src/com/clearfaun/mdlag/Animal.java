package com.clearfaun.mdlag;

/**
 * Created by SpencerDepas on 6/14/16.
 */
public class Animal implements Prototype<Animal> {

    private String name = "";
    private String type = "";


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Animal clone()
            throws CloneNotSupportedException {
        return (Animal)super.clone();
    }
}