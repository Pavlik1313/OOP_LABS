package com.company;
import java.util.Scanner;
import java.util.ArrayList;


public class Text {
    private Sentence[] sentences;
    public static ArrayList<String> words = new ArrayList<String>();
    public Text(String s) {
        String[] split = s.split("(?=[.!?])|\\s");
        sentences = new Sentence[split.length];
        for (int i = 0; i < split.length; i++) {
            sentences[i] = new Sentence(split[i]);
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            sb.append(sentence.toString());
        }
        return sb.toString();
    }

    public static int keyForSort(String s, char l) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i,i+1).equalsIgnoreCase(String.valueOf(l))) counter++;
        }
        return counter;
    }
    public static void  MySort (){
        System.out.println("Введіть букву, за кількістю входжень якої потрібно відсортувати слова: ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        String[] array = new String[words.size()];
        for (int i = 0; i != words.size(); i++) {
            array[i] = words.get(i);
        }
        boolean sorted = false;
        String temp;
        while(!sorted) {
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (keyForSort(array[i], letter) > keyForSort(array[i+1], letter)) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }

        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }


}