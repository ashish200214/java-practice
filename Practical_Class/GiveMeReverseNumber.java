package Practical_Class;

import java.util.Scanner;

public class GiveMeReverseNumber {
static int giveMeReverseNo(int no){
    int reverse = 0;
    while (no>0) {

        reverse = reverse*10+(no%10);
        no = no/10;
    }
    return reverse;
}
public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int no= scan.nextInt();
    System.out.println("Reverse is : "+giveMeReverseNo(no));
}
}
