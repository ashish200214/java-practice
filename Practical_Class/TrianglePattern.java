package Practical_Class;

public class TrianglePattern {
    static void displayPattern(){
        for(int row=1;row<=4;row++){
            for(int space=1;space<=row;space++){
                System.out.print(" ");
            }
            for (int col=4;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayPattern();
    }
}
