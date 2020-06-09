package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int k = 1;
        MayBeProcessed.appendTrain(new Head(k, 0,0,0));
        k++;
        for (int i = 0; i < 1+(new Random().nextInt(4)); i++){
            MayBeProcessed.appendTrain(new SittingTrain(k, 90+(new Random().nextInt(180)),
                    40+(new Random().nextInt(25)), 1+(new Random().nextInt(4))));
            k++;
        }
        for (int i = 0; i < 1+(new Random().nextInt(4)); i++){
            MayBeProcessed.appendTrain(new EconomClassTrain(k, 120+(new Random().nextInt(240)),
                    36+(new Random().nextInt(18)), 3+(new Random().nextInt(4))));
            k++;
        }
        for (int i = 0; i < 1+(new Random().nextInt(4)); i++){
            MayBeProcessed.appendTrain(new CommonTrain(k, 180+(new Random().nextInt(240)),
                    50+(new Random().nextInt(25)), 1+(new Random().nextInt(3))));
            k++;
        }
        for (int i = 0; i < 1+(new Random().nextInt(4)); i++){
            MayBeProcessed.appendTrain(new CompartmentTrain(k, 60+(new Random().nextInt(120)),
                    28+(new Random().nextInt(8)), 5+(new Random().nextInt(5))));
            k++;
        }


        System.out.println("\n\nВсього пасажирів: "+ MayBeProcessed.getTotalPassengers());
        System.out.println("Всього вантажу: "+ MayBeProcessed.getTotalCargoWeight()+ " Кг");
        Sorts.sortComfort();
        Sorts.findTrains();
    }


}
