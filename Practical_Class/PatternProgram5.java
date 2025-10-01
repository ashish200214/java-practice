package Practical_Class;

public class PatternProgram5 {
    static void displayPattern(){
        for(int row=1;row<=5;row++){
            for(int col=1;col<=5;col++){
                if(row==1 || row==5 || col==1 ||col==5){
                    if(row%2!=0){
                        System.out.print(1);
                    }else{
                        System.out.print(0);
                    }
                }
                else{

                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        displayPattern();
    }
}
