package com.company;

public class Main {

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(new CommonTrain(1, 20, 20 ,20));
        System.out.println(myList.get(0));
    }
}
