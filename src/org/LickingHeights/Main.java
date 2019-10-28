package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int numberInMyHead;
        int numberGuessed;
        numberInMyHead = (int) (Math.random() * 100) + 1;
        System.out.println("Guess a number 1-100");

        do {

            numberGuessed = keyboard.nextInt();

          guessingGame(numberInMyHead, numberGuessed);

        } while (numberGuessed != numberInMyHead);



    }


   





