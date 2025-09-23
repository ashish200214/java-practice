package Practical_Class;

import java.util.Scanner;

public class ArmStrongNoOrNot {
static int powerReturn(int no, int pow){
    int sum =1;
    for(int i=1;i<=pow;i++){
        sum *= no;
    }
    return sum;
}
static int giveMeLength(int no){
    int  count=0;
    while (no>0) {
        count++;
        no = no/10;
    }
    return count;
}
static void checkArmStrong(int no){
    int sum=0;
    int noOfDigit = giveMeLength(no);
    int originalOne =no;
    while(no>0){
        int rem = no%10;
        sum =sum+powerReturn(rem,noOfDigit);
        no = no/10;
    }
    if(originalOne==sum){
        System.out.println("ArmStrong Number");
    }
    else{
        System.out.println("Not ArmStrong Number");
    }
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Number");

    int no = scan.nextInt();
    checkArmStrong(no);
}
}
