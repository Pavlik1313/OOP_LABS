package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введіть текст (або копіюйте цей приклад: ABABABA, aaa, dsaafa. darakamaAA, sdfgjj )");
        Scanner scanner = new Scanner(System.in);
        String input_text = scanner.nextLine();
        Text text = new Text(input_text);
        Text.MySort();
    }
}