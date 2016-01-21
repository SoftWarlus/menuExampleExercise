package p1;

/*
 * Exercise for basic menu ordering
 * CSC 164
 * Uros Vorkapic
 * Jan 21, '16
 * Version 0.9
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Jimmy John\'s");

        char option;
        double price;
        String sandwich = "";
        do {
            System.out.println("(H)am");
            System.out.println("(R)oast Beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");
            System.out.print("Enter your choice: ");

            //Defines choice and sets it to uppercase
            //String choice = input.next().toUpperCase();

            //Grabs first character of choice
            //Everything can be simplified to that:
            option = input.next().toUpperCase().charAt(0);

            switch (option) {
                //Ham
                case 'H':
                    price = 5.50;
                    sandwich = "Ham";
                    break;
                //Roast Beef
                case 'R':
                    price = 6.00;
                    sandwich = "Roast Beef";
                    break;
                //Salami
                case 'S':
                    price = 5.25;
                    sandwich = "Salami";
                    break;
                //Tuna
                case 'T':
                    price = 5.00;
                    sandwich = "Tuna";
                    break;
                //Done
                case 'D':
                    price = 0;
                    break;
                default:
                    price = 0;
                    System.out.println("No such sandwich exists.");
            }

            //Give the user the order information if valid order
            if (price != 0) {
                System.out.printf("%s Sandwich Costs $%.2f\n", sandwich, price);
            }

            //System.out.println("choice = " + choice + "; option = " + option);


        } while (option != 'D');

        System.out.println("Goodbye");
    }
}
