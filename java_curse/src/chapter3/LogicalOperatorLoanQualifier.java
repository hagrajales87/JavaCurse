package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make ate least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LogicalOperatorLoanQualifier {

    public static void main(String[] args){

        //Initialize what we know
        int requiredSalary = 3000;
        int requiredYearsEmployed = 2;

        //Get what we don't
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        // Make decision
        if(salary >= requiredSalary && years >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan");
        }
        else{
            System.out.println("You must have at least 2 years working and earns more or equals to 3000");
        }
    }
}
