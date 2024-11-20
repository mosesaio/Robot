package org.example;


public class Main{
    public static void main(String[] args ){
        Robot myRobot = new Robot(); //Create a new robot object.
        myRobot.displayInfo(); // Displays information on the robot.
        myRobot.move(); //make the robot move.
        myRobot.checkBatteryLevel();
        myRobot.stop(); //stop the robot.
        myRobot.chargeBattery();  //charge the robot's battery.
    }
}


