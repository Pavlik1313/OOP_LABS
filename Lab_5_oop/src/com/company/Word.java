package com.company;
import java.util.ArrayList;


public class Word extends SentenceMember {
    private ArrayList<Letter> letters;
    public Word(String s) {
        Text.words.add(s);
        letters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            letters.add(new Letter(s.charAt(i)));
        }
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Letter letter : letters) {
            sb.append(letter.toString());
        }
        return sb.toString();
    }
}