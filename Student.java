public class Student {
String name;
private int age;

void doRegister(){

}
public void setAge(int age) {
    if(age>5 && age<100){
    this.age = age;

    }
    else{
        System.out.println("you entered wrong age");
        
    }
}
public static void main(String[] args) {
    Student obj = new Student();
    obj.name="sakshi mam";

    Student obj2 = new Student();
    obj2.name="ashish";

}
}
