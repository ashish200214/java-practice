package Practical_Class;

public class PatternProgram2 {
    static void displayPattern(){
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        displayPattern();
    }
}
