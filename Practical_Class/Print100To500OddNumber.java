package Practical_Class;

public class Print100To500OddNumber {
    static void print100To500OddNumber(){
        for (int i = 100; i <= 500; i++) {
            if(i%2!=0)
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        print100To500OddNumber();
    }
}
