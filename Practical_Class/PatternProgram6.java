package Practical_Class;

public class PatternProgram6 {
    static void displayPattern(){
        int no=9;
        for(int row =1;row<=5;row++){
            for(int col=row;col<=5;col++){
                System.out.print(no);
            }
            no=no-2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayPattern();
    }
}
