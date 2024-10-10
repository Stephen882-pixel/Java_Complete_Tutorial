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

        // Looping through an array 
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
        for(int i=0;i<myNum.length;i++){
            System.out.println(myNum[i]);
        }

        for (String i : cars){
            System.out.println(i);
        }

        int ages[] = {10,20,30,40,50,60};

        float avg, sum = 0;

        int length = ages.length;

        for (int age : ages){
            sum+=age;
        }

        avg = sum/length;
        System.out.println("The average age is: " + avg);
    }
}