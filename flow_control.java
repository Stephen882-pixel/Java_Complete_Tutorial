class ControlFlow{
    public static void main(String[] args) {
        int num = 10;
        if (num < 0){
            System.out.println("This number must be a negative number");
        }
        System.out.println("The number is either a zero or a positive number");

        /*if a condition evaluates to true then the lines of code inside if are executed 
        and if a value evaluates to false, the lines of code inside if are skipper*/
        String language = "python";
        if (language == "java"){
            System.out.println("Best programming language in the world");
        }
        System.out.println("The language is still dope");

        // Java if...else statement - >The if..else statement executes a certain section of code if the test expression is evaluated to true.However,if the test is evaluated to false it does nothing.In this case we can use an optional else block.Statements inside of the body of the else block are executed if the test expression is executed to false

        int num1 = 10;
        if (num1 < 0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
        System.out.println("This is just some random text");

        // if...else...if -> Here if statements are executed from top downwards to the bottom.When the test condition is true,codes inside the body of that if block is executed.And,program jumps outside the if..else..if ladder.so if all test expressions are false,codes inside the body of else are executed.

        int num2 = 0;
        if (num2 > 0){
            System.out.println("The number is positive");
        }else if(num2 < 0 ){
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is zero");
        }

        // Nested if..else statement - this is using if...else inside another if...else statement 
        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;
        if (n1>=n2){
            if (n2>=n3){
                largest = n1;
            }
            else {
                largest = n3;
            }
        }else{
            if (n2>=n3){
                largest = n2;
            } else {
                largest = n3;
            }
        }
        System.out.println("Largest number: " + largest);
    }
}
