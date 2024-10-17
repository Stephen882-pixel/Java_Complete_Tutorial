class Human{
    private int age;
    private String name;

    // public  Human(){  /* for a contructor you do no specify the return type and a contructor too has the same name as the class name 
        // and again every time you create a constructor the object will automatically be called.
        // This constructor in which no parameters are passed is what we call parameter constructor*/
       
    //     name = "John";
    //     age = 30;
    // }
    // public Human(int age,String name){ // This is a parameterized constructor
    //     this.age = age; 
    //     this.name = name;
    // }
    public int getAge() {
        return age;
    }

    public Human(int age) {
        this.age = age;
    }

    public Human(String name) {
        age = 15;
        this.name = name;
    }

    public Human() {  
        age = 12;
        name = "Newton";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Human obj = new Human("Kenndy"); // When you create a new object it will create a constructor
        // System.out.println(obj.getName() + " : " + obj.getAge());
        // Human obj1 = new Human(10,"Stephen");
        // System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj.name);
    }
}