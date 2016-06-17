package com.clearfaun.mdlag;

public class Main {

    //client
    //
    //
    public static void main(String[] args) {
 

        Animal sheep = new Sheep("Silly Sam").getAnimal();

        System.out.println(sheep.getType());
        //sheep
        System.out.println(sheep.getName());
        //Silly Sam

        System.out.println();

        try {
            Animal sheepClone = sheep.clone();

            System.out.println(sheepClone.getType());
            //sheep
            System.out.println(sheepClone.getName());
            //sam the sheeppppppppp
            //perfect clone

            System.out.println();
            System.out.println();

            sheepClone.setName("Diana");
            sheepClone.setType("Sheep Clone");
            sheepClone.setName("Diana");


            System.out.println(sheepClone.getType());
            //sheep clone
            System.out.println(sheepClone.getName());
            //Diana
            //data has changed but does the old sheep remain the same?

            System.out.println();



        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        //the old sheep remains the same
        //two sheep with two
        System.out.println(sheep.getType());
        //sheep
        System.out.println(sheep.getName());
        //sam the sheep




    }
}
