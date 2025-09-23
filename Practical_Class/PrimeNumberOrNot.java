package Practical_Class;

import java.util.Scanner;

public class PrimeNumberOrNot {
    static void primeOrnot(int no){
          for(int i=2;i<no;i++){
            if(no%i==0){
                System.out.println("Not Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int no = scan.nextInt();
        primeOrnot(no);
    }
}
