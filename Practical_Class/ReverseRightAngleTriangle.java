package Practical_Class;

import java.util.Scanner;

public class ReverseRightAngleTriangle {
    static void displayPattern(int no){
        for(int row=1 ;row<=no;row++){
            for(int col = row;col<=no;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Rows ");
        int no =scan.nextInt();
        displayPattern(no);
    }
}
