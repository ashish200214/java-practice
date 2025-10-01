package Practical_Class;

public class FibonaachiSeries {
static void printFiboNacchi(int no){
int n1 = 0;
int n2= 1;
System.out.print(n1+" ");
System.out.print(n2+" ");

for(int i=3;i<=no;i++){
    int n3 = n1+n2;  //0+1 (n3=1)
    System.out.print(n3+" ");

    n1=n2;  //n1 = 1
    n2=n3;  //n2 = 1
}
}
public static void main(String[] args) {

    printFiboNacchi(10);
}
}
