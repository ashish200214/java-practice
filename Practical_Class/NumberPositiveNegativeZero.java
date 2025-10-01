package Practical_Class;

import java.util.Scanner;
//hybrid inheritance
class TakeNumber{
    int num;
    void takeNumber(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Number : ");
        this.num=scan.nextInt();
    }
}
class CheckPositiveOrNot extends TakeNumber{
    String output;
    void check(){
        if(this.num==0){
            this.output = "Number is Zero";
        }
        else if(this.num>0){
            this.output = "Number is Positive";
        }else{
            this.output = "Number is Negative";
        }
    }
}
class DisplayResult extends CheckPositiveOrNot{
    void printResult(){
        System.out.println(this.output);
    }
}
public class NumberPositiveNegativeZero {
    public static void main(String[] args) {

        DisplayResult result = new DisplayResult();
        result.takeNumber();
        result.check();
        result.printResult();
    }
}
