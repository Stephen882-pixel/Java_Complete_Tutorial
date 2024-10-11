package package_four_Encapsulation;

// Encapsulation is protecting the properties of a class

public class Student {
    private String name;
    private int age;
    private String address;

    public  Student (String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return  name;
    }
    public  int getAge(){
        return  age;
    }
    public String getAddress(){
        return  address;
    }

    @Override
    public  String toString(){
        return ("Student name is " + this.getName() +
                ", age is: " + this.getAge() + "and address is: " +
                this.getAddress());
    }
    public static void main(String[] args){
        Student john = new Student("John",35,"Nairobi");
        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getAddress());
    }
}
