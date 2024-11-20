package org.example;

public class Robot{
    int batteryLevel= 100; //Battery level percentage for the robot (0 to 100).
    int speed = 0; //Current speed of the robot.
    String name = "Robo";  //Name of the Robot.
    int weight = 35;
    String color = "burgundy";

    public void move(){
        speed=5;
        System.out.println(name+ " is moving at speed " + speed+ "mph.");
    }

    public void stop(){
        speed=0;
        System.out.println(name+ " has stopped." );
    }

    public void chargeBattery(){
        batteryLevel= 100;
        System.out.println(name + "'s battery is fully charged.");

    }

    public void checkBatteryLevel(){
        System.out.println(name+ " current battery level is " + batteryLevel + "%.");
    }

    public void displayInfo(){
        System.out.println("The robot's name is " +name+ ", its weight is " + weight +", and its color is " + color + ".");
    }
}
