package Practical_Class;

public class FactorialNumber {
static int giveMeFActorial(int no){
    int factorial = 1; //if start with 0 multiplying 0 with any gives 0.
    for(int i=1;i<=no;i++){
        factorial = factorial*i;
    }
    return factorial;
}
public static void main(String[] args) {
    System.out.println(giveMeFActorial(5));
}
}
