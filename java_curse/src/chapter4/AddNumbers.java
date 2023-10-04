package chapter4;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sum up two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers {

    public static void main(String[] args) {

        boolean again;

        Scanner scanner;

        do {
            scanner = new Scanner(System.in);

            System.out.println("Insert the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Insert the second number: ");
            double num2 = scanner.nextDouble();

            double total = num1 + num2;

            System.out.println(num1 + " + " + num2 + " is equals to: " + total);

            System.out.println("Do you want do it again and sum two numbers? true/false");
            again = scanner.nextBoolean();

        } while(again);

        scanner.close();
    }
}
