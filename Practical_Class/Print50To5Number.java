package Practical_Class;

import java.util.Arrays;

class ReturnTheResult{
    int diff50minus5 = 51-5;
    int[] numbers = new int[diff50minus5];
    ReturnTheResult(){
        int arrayIndex=0;
        for(int i=50;i>=5;i--){
            this.numbers[arrayIndex]=i;
            arrayIndex++;
        }
    }
}
class DisplayResultOf50to5 extends ReturnTheResult{
    DisplayResultOf50to5(){
        System.out.println(Arrays.toString(this.numbers));
    }
}
public class Print50To5Number {
    public static void main(String[] args) {
        DisplayResultOf50to5 displayResultOf50to5 = new DisplayResultOf50to5();

    }
}
