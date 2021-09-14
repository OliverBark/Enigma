package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
/*	char letter = 'Å';
    int number = letterToNumber(letter);
        System.out.printf("Bogstavet %c bliver til %d", letter, number);*/

/*        String plaintext = "ABE";
        int [] cipher = textToListOfNumbers(plaintext);

        System.out.println(Arrays.toString(cipher));*/

        int number = 27;
        char letter = numberToLetter( number);
        System.out.printf("Tallet %d bliver til bogstavet %c\n", number, letter);

        int [] cipher ={1,2,5};
        String plaintext = listOfNumbersToText(cipher);
        System.out.println("Den krypterede tekst er: ");
        System.out.println(plaintext);
    }

    public static int[] textToListOfNumbers(String text){
        int [] numbers = new int[text.length()];
        char[] letters = text.toCharArray();

        for(int i = 0; i < text.length(); i++) {
            numbers[i] = letterToNumber(letters[i]);
        }

        return numbers;
    }

    public static int letterToNumber(char letter) {

        String alfabet = " ABCDEFGHIJKLMNOPQRSTUVXYZÆØÅ";
        return alfabet.indexOf( letter );

    }

    public static String listOfNumbersToText (int[] numbers) {
        StringBuilder text = new StringBuilder();
        for (int number : numbers) {
            char letter = numberToLetter(number);

            text.append(letter);
        }
        return text.toString();
    }

    public static char numberToLetter ( int number){
        String alfabet = " ABCDEFGHIJKLMNOPQRSTUVXYZÆØÅ";
        return alfabet.charAt(number);
    }
}
