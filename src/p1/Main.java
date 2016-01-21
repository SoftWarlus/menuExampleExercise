package p1;

/*
 * Exercise for basic menu ordering
 * CSC 164
 * Uros Vorkapic
 * Jan 21, '16
 * Version 0.1
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Jimmy John\'s");

        char option;
        do {
            System.out.println("(H)am");
            System.out.println("(R)oast Beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");
            System.out.print("Enter your choice: ");

            //Defines choice and sets it to uppercase
            String choice = input.next();
            choice = choice.toUpperCase();

            //Grabs first character of choice
            option = choice.charAt(0);

            System.out.println("choice = " + choice + "; option = " + option);

        } while (option != 'D');

        System.out.println("Goodbye");
    }
}
