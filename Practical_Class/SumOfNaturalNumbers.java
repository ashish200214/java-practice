package Practical_Class;

import java.util.Scanner;

public class SumOfNaturalNumbers {
static int giveMeSumOfNaturalNumber(int no){

return no*(no+1)/2;
}
public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int no= scan.nextInt();
    System.out.println("Sum is "+giveMeSumOfNaturalNumber(no));
}
}
