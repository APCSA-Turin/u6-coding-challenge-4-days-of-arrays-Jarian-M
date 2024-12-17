package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute

        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int distanceTraveled;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            distanceTraveled = 0;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            if(runDuration > 0) {
                distanceTraveled += speed;
                runDuration--;
            } else if (restDuration > 0) {
                restDuration--;
            }
        }

        public String getName() {
            return name;
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        for(int i = 0; i < time; i++) {
            for(Reindeer reindeer : reindeers) {
                reindeer.simulateSecond();
            }
        }

        Reindeer winner = null;
        for(Reindeer reindeer : reindeers) {
            if(winner == null)
        }
        return "name of winner";
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}



