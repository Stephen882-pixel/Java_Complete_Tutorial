import java.util.Scanner;
class Input_and_Output{
    public static void main(String[] args) {
        // Difference between println(),print() and printf()
        /*print() -> prints values inside quotes without adding a new line
          println() -> Prints values inside the quotes and add a new line
          printf() - > It provides string formatting
         */

         // Printing concatenatetd strings 
         System.out.println("You are such a lovely " + "Person");
         int num1 = 10;
         System.out.println("Number = "  + num1);


        //  JAVA Input -> we'll use the scanner class to input values
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        System.out.println("Please enter your name:");
        String name = input.next();
        System.out.println("Your name is :" + name);
        input.close();
    


    }
}