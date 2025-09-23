public class PerfectNumberOrNot {

    //sum of its divisior is equal to that number then it is called perfect no.
    //ex. 12 -> divisiors (1,2,3,4,6,)
    static void checkPerfectOrNot(int no){
        int sum=0;
        for(int i=1;i<no;i++){
            if(no%i==0){
                sum = sum+i;
            }
        }
        if(sum==no){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
    }
    public static void main(String[] args) {
        checkPerfectOrNot(6);
    }
}
