package com.company;

import java.util.Scanner;

public class Sorts {
    public static void sortComfort(){
        boolean sorted = false;
        Train temp;
        Train[] array = MayBeProcessed.getCars();
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].getComfort() > array[i+1].getComfort()) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }


        }
        System.out.println("\nВагони відсортовані за комфортом\n");
        for (int i = 0; i < array.length - 1; i++){
            System.out.println(array[i]);
        }
    }
    public static void findTrains(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nЗнати вагони в яких пасажирів від: ");
        int left = in.nextInt();
        System.out.print("До: ");
        int right = in.nextInt();
        Train[] array = MayBeProcessed.getCars();
        for (int i = 0; i < array.length; i++){
            if (array[i].getPassengers()>=left && array[i].getPassengers()<=right){
                System.out.print(array[i]+"\n");
            }
        }
    }
}
