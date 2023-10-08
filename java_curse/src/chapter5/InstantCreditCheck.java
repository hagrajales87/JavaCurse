package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class InstantCreditCheck {

    static int requiredCreditScore = 700;
    static int requiredSalary = 25000;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        //Get What we don't know
        double salary = getSalary();
        int creditScore = getCreditScore();

        scanner.close();
        // Check if the user is qualified

        boolean qualified = isUserQualified(salary, creditScore);

        notifyUser(qualified);
    }


    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = scanner.nextInt();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return  creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore){
        if(creditScore >= requiredCreditScore && salary > requiredSalary){
            return true;
        }else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You've been approved.");
        }
        else{
            System.out.println("Sorry, You've been declined");
        }
    }

}
