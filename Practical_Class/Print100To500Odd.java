package Practical_Class;

import java.util.Arrays;

class ReturnTheResultOf100to500{
    int diff501minus100 = ((500-100)/2);
    int[] numbers = new int[diff501minus100];
    ReturnTheResultOf100to500(){
        int index=0;
        for(int i=500;i>=100;i--){

            if(i%2!=0){
                this.numbers[index]=i;
                index++;
            }
        }
    }
}
class DisplayResultOf500to100 extends ReturnTheResultOf100to500{
     DisplayResultOf500to100(){
        System.out.println(Arrays.toString(this.numbers));
    }
}
public class Print100To500Odd {
    public static void main(String[] args) {
        DisplayResultOf500to100 resultOf500to100 = new DisplayResultOf500to100();
    }
}
