package Practical_Class;

public class SolidSquarePattern {
static void solidSquarePattern(int no){
    for(int col = 0;col<no;col++){
        for(int row=0;row<no;row++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
 solidSquarePattern(5);   
}
}
