package com.timmy;

public class DinosaurSupervisor {

    public static void main(String[] args) {

        // Create a dinosaur object. Invokes Dinosaur constructor.
        Dinosaur t_rex = new Dinosaur();
        t_rex.color = "red";
        t_rex.name = "Tyrannosaurus Rex";
        t_rex.roar();

        System.out.println("The name of this dinosaur is " + t_rex.name);
        System.out.println("Its color is " + t_rex.color);

        Dinosaur velociraptor = new Dinosaur();
        velociraptor.color = "blue";
        velociraptor.name = "Velociraptor";
        velociraptor.roar();

        System.out.println("The name of this dinosaur is " + velociraptor.name);


    }
}
