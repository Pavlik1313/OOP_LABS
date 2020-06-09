package com.company;

import java.util.ArrayList;

public class MayBeProcessed {
    private  static ArrayList<Train> cars = new ArrayList<Train>();
    private  static int totalCargoWeight = 0;
    private  static int totalPassengers = 0;

    public static void appendTrain (Train t){
        cars.add(t);
        System.out.println(t);
        totalCargoWeight += t.getBaggage();
        totalPassengers += t.getPassengers();
    }


    public static Train[] getCars(){
        Train[] output = new Train[cars.size()];
        for (int i = 0; i != cars.size(); i++) {
            output[i] = cars.get(i);
        }
        return output;
    }


    public static int getTotalPassengers(){
        return totalPassengers;
    }


    public static int getTotalCargoWeight(){
        return totalCargoWeight;
    }

}
