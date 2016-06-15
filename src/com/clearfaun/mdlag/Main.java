package com.clearfaun.mdlag;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try {

            Sheep sheep = new Sheep();
            Sheep clone = sheep.clone();
            clone.getAnimal().setName("David");

            System.out.println(sheep.getAnimal().getType());

            System.out.println(sheep.getAnimal().getName());
            System.out.println(clone.getAnimal().getName());


        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }



    }
}
