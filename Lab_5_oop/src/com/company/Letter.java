package com.company;

public class Letter {
    private char letter;

    public Letter(char letter) {
        this.letter = letter;
    }


    public String toString() {
        return String.valueOf(letter);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Letter) {
            return String.valueOf(letter).equalsIgnoreCase(String.valueOf(obj));
        }
        return false;
    }

}