package Practical_Class;
// Hello everyone kindly complete the task :
// Print the,country names,city names,state names using multilevel inheritance!
class Address{
    String countryName;
    String city;
    String state;
}
class Person extends Address{
String name;
public void displayData(){
    System.out.println("Name : "+this.name);
    System.out.println("Country : "+this.countryName);
    System.out.println("State : "+this.state);
    System.out.println("City : "+this.city);
}
}
public class MultiLevelExample {
public static void main(String[] args) {
    Person p1 = new Person();
p1.name="Ashish";
p1.countryName="India";
p1.city="Solapur";
p1.state="Maharashtra";

p1.displayData();
}
}
