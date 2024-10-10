package oop;

public class Student {
    //    A class is a blueprint of an object
    String name;
    int age;
    String address;


    //  Constructor
    public Student(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //    Setters and getters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String  address){
        this.address = address;
    }
    //    getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }
    @Override
    public String toString(){
        return ("Student name is " + this.getName() +
                ",age is:" + this.getAge() + " and address is: " +
                this.getAddress());
    }
    public static void main(String[] args){
        Student john = new Student("John",25,"23 East,California");
        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getAddress());
    }
}
