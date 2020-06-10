package com.company;

public abstract class Train {
    private int baggage;
    private int passengers;
    private int comfort;
    private int numb;
    private String type;

    public int getBaggage(){
        return baggage;
    }


    public int getPassengers(){
        return passengers;
    }


    public int getComfort(){
        return comfort;
    }


    public int getNumb(){
        return numb;
    }


    public String getType(){
        return type;
    }


    public Train(int numb, int baggage, int passengers, int comfort, String type){
        this.numb = numb;
        this.baggage =baggage;
        this.passengers = passengers;
        this.comfort = comfort;
        this.type = type;
    }


    @Override
    public String toString() {
        return "Вагон №: " + numb
                + "\t\tТип вагону: " + type
                + "\t\tКількість пасажирів: " + passengers
                + "\t\tМаса вантажу: " + baggage + " Кг "
                + "\t\tРівень комфорту: " + comfort + "★";
    }
}

