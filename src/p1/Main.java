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
        int quantity;
        double price;
        double total = 0;
        String sandwich = "";
        do {
            System.out.println("Please select a sandwich from the options listed below.");
            System.out.println("(H)am");
            System.out.println("(R)oast Beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");
            System.out.println("(Q)uit");
            System.out.print("Enter your choice: ");
            option = input.next().toUpperCase().charAt(0);

            //Possible options and their pricing
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
                case 'Q':
                    price = 0;
                    break;
                default:
                    price = 0;
                    System.out.println("No such sandwich exists.");
            }

            //Asks for further information if a valid order is selected
            if (price != 0) {
                System.out.print("How many sandwiches would you like: ");
                quantity = input.nextInt();
                total += price * quantity;
                //Provides user with price for their selection and running total
                System.out.printf("%d %s Sandwich(s) Costs $%.2f\n", quantity, sandwich, (price * quantity));
                System.out.printf("You current total is: $%.2f\n", total);
                System.out.print("Would you like to order more sandwiches? (Y/N): ");
                option = input.next().toUpperCase().charAt(0);
                //Converts a "no" response to a "done"
                if (option == 'N') {
                    option = 'D';
                }
            }

        } while (option != 'D' && option != 'Q');

        //Prints receipt if user is done making an order, else prematurely terminates program
        if (option == 'D') {
            System.out.printf("\nYour total will be: $%.2f\n", total);
        } else {
            System.exit(0);
        }

        System.out.println("\n//Thank you for dining at Jimmy John\'s//");
    }
}
