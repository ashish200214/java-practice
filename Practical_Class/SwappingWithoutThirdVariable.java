package Practical_Class;

import java.util.Scanner;

public class SwappingWithoutThirdVariable {
    static void swapWithoutThirdNumber(int no1,int no2){
        //suppose
        // no1 =10 
        // no2 = 20
        // no1 = no1+no2 (no1 = 30)
        // no2 = no1-no2  (30-20 = 10)
        // no1 = no1-no2   (30-10 = 20)
         System.out.println("Before Swap : ");
        System.out.println("no1 : "+no1);
        System.out.println("no2 : "+no2);

        no1 = no1+no2;
        no2 = no1-no2;
        no1 = no1-no2;

          System.out.println("After Swap : ");
        System.out.println("no1 : "+no1);
        System.out.println("no2 : "+no2);

        
    }
     public static void main(String[] args) {
        System.out.println("Enter two Number : ");
        Scanner scan = new Scanner(System.in);
        int no1= scan.nextInt();
        int no2= scan.nextInt();
        swapWithoutThirdNumber(no1, no2);
    }
}
