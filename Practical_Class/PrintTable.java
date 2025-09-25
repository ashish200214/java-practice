package Practical_Class;

import java.util.Scanner;

public class PrintTable {
static void printTable(int n){
for(int i=1;i<=10;i++){
    System.out.println(n+"*"+i+"="+(n*i));
}
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int no= scan.nextInt();
    printTable(no);
}
}
