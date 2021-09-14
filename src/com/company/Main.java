package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
/*	char letter = 'Å';
    int number = letterToNumber(letter);
        System.out.printf("Bogstavet %c bliver til %d", letter, number);*/

        String plaintext = "ABE";
        int [] cipher = textToListOfNumbers(plaintext);

        System.out.println(Arrays.toString(cipher));
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
/*        char[] alfabet = {'A','B','C','D','E'};
        int[]  numre   = { 1,  2,  3,  4,  5 };

        int nummer = 0;
        for(int i = 0; i< alfabet.length; i++){
            char bogstavetViTjekker = alfabet[i];
            if( letter == bogstavetViTjekker){
                System.out.printf("Fundet bogstav %c på index %d", bogstavetViTjekker, i);
                nummer = i;
                //nummer = numre[i]
                System.out.printf("og det har nummer: ∞d\n", nummer);
            }
        }
*/
        String alfabet = " ABCDEFGHIJKLMNOPQRSTUVXYZÆØÅ";
        int num = alfabet.indexOf( letter );
        return num;

    }
}
