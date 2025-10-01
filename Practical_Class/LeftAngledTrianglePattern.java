package Practical_Class;

import java.util.Scanner;

public class LeftAngledTrianglePattern {
    static void displayPattern(int no){

        for(int row=no;row>=1;row--){
            int ch = 65;
            for(int space=5;space>row;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print((char)ch);
                ch = ch+1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter Number of Rows : ");
        Scanner scan =new Scanner(System.in);
        int no = scan.nextInt();
        displayPattern(no);
    }
}
