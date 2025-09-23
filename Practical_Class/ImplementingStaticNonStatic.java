package Practical_Class;

public class ImplementingStaticNonStatic {
    //non static method
    void nonStaticMethodExample(){
        System.out.println("I am non static method and I require object to call.");
    }    

    //static method
    static void staticMethodExample(){
        System.out.println("I am static method and I dont require object to call.");
    }
    
    public static void main(String[] args) {
        ImplementingStaticNonStatic obj = new ImplementingStaticNonStatic();
        obj.nonStaticMethodExample();
        staticMethodExample();    
    }
}
