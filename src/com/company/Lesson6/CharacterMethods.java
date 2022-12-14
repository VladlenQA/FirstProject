package com.company.Lesson6;

public class CharacterMethods {
    public static void main(String[] args) {
        char c = '\n';
        char t = '\t';
        char empty = ' ';
        boolean isLetter = Character.isLetter(c);
        System.out.println("isLetter: " + isLetter);
        System.out.println("isDigit: " + Character.isDigit(c));
        System.out.println("isWhiteSpace: " + Character.isWhitespace(t));
    }
}
