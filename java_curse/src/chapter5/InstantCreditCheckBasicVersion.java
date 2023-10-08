package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class InstantCreditCheckBasicVersion {

    public static void main(String[] args){

        // Initialize what we know
        double minSalary = 25000;
        double minScore = 700;

        // Get what we don't know
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which is your current Salary:");
        double currentSalary = scanner.nextDouble();

        System.out.println("Which is your current score:");
        double currentScore = scanner.nextDouble();

        String isCreditWasApproved;
        // Check if the user is qualified
        if(currentSalary > minSalary && currentScore >= minScore){
            isCreditWasApproved = "The credit check was approved";
        }else
        {
            isCreditWasApproved = "The credit check wasn't approved";
        }

        // Notify the user
        System.out.println(isCreditWasApproved);
    }
}
