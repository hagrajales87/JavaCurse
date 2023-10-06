package chapter5;

import java.util.Scanner;

/*
 * OUR FIRST METHOD
 *  Write a method that asks a user for their mane, then greets them by name.
 */
public class Greetings {

    public static void main(String[] args){
        String greets;
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, insert your name:");
        name = scanner.next();

        Greetings greetings = new Greetings();
        greets =greetings.askName(name);
        System.out.println(greets);

        scanner.close();

        // option2
        getUser(name);
    }

    //option 1
    public String askName(String name){
        String yourName;
        String greets;

        yourName = name;
        greets = "Hi " + yourName + " have a nice day!";
        return greets;
    }

    //option 2
    public static  void getUser(String name){
        System.out.println("Hi there, " + name);
    }
}
