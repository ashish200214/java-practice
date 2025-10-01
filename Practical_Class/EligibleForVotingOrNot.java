package Practical_Class;

import java.util.Scanner;

public class EligibleForVotingOrNot {
    static void checkEligibleForVotingOrNot(int age){
        if(age>=18){
            System.out.print("Eligible for voting");
        }else{
            System.out.println("Not Eligible for voting");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age = scan.nextInt();
        checkEligibleForVotingOrNot(age);
    }
}
