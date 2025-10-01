package Practical_Class;

public class DiamondPatter {
    static void displayPattern(){
        for(int row=1;row<=3;row++){
            for(int space=3;space>=row;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=3;row++){
            for(int space=1;space<=row;space++){
                System.out.print(" ");
            }
            for(int col=3;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
    displayPattern();
    }
}
