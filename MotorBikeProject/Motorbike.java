package MotorBikeProject;

public class Motorbike {

    int speed; // Instance variable. State of the motorbike class. Can only be referred by an instance of the class. Can keep changing.

    public void start(){

        System.out.println("Bike has started!");
    }


    public static void main(String[] args) {
        Motorbike honda = new Motorbike();
        Motorbike ducati = new Motorbike();

        honda.start();
        ducati.start();

        honda.speed = 100;
        ducati.speed = 80;

    }

}
