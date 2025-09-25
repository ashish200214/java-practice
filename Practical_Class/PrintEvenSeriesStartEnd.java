package Practical_Class;

public class PrintEvenSeriesStartEnd {
    static void printEvenSeries(int start , int end){
        for(int i=start;i<=end;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        printEvenSeries(1,100);
    }
}
