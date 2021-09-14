package com.company;

public class Main {

    public static void main(String[] args) {
/*	char letter = 'Å';
    int number = letterToNumber(letter);
        System.out.printf("Bogstavet %c bliver til %d", letter, number);*/

        String plaintext = "ABE";
        int [] cipher = textToListOfNumbers(plaintext);
    }

    public static int[] textToListOfNumbers(String text){
        int [] liste = new int[text.length()];

        liste [0] = 1;
        liste [1] = 2;
        liste [2] = 5;

        return liste;
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
