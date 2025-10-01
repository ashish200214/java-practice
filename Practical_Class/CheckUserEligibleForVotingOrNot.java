package Practical_Class;

import java.util.Scanner;

class TakeAge{
    int age;
    TakeAge(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age : ");
         this.age =scan.nextInt();
    }
}
class VotingCriteria extends  TakeAge{
    String output;
    VotingCriteria(){
        if(this.age>=18){
            this.output = "Eligible for voting";
        }else{
            this.output = "Not Eligible for voting";
        }
    }
}
class DisplayResultOfVoting extends VotingCriteria{
    DisplayResultOfVoting(){
        System.out.println(this.output);
    }
}
public class CheckUserEligibleForVotingOrNot {
    public static void main(String[] args) {
        DisplayResultOfVoting displayResultOfVoting = new DisplayResultOfVoting();

    }
}
