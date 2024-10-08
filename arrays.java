class arrays{
    public static void main(String[] args) {
        String[] cars = {"volvo","Tesla","BMW","Mazda"};
        int[] myNum = {10,20,30,40};

        // Accessing array elements 
        System.out.println(cars[0]);
        System.out.println(myNum[2]);

        // Changing an array element 
        cars[0] = "Toyota";
        System.out.println(cars[0]);
        
        // Checking the array length
        System.out.println(cars.length);
        System.out.println(myNum.length);
        
    }
}