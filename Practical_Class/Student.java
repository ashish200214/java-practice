package Practical_Class;

class Student{
    private String name;
    private int rollNo;
   private int age;
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age>18 && age<=50){
            this.age = age;
        }else{
            System.out.println("invalid age");
        }
    }

}