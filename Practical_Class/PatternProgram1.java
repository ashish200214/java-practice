package Practical_Class;

public class PatternProgram1 {
     //  AAAAA
     //  BBBBB
     //  CCCCC
     //  DDDDD
     //  EEEEE
    static void displayPattern(){
        for (int i = 65; i <=69; i++) {
            for (int j = 65; j <= 69; j++) {
                System.out.print((char)(i));

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        displayPattern();
    }
}
