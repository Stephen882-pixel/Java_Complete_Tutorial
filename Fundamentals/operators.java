class operators{
    public static void main(String[] args) {
        /*Operators are symbols that perfom operations of variables and values
         * Operators in java are classified into 5 types:
         * 1.Arithmetic operator
         * 2.Assignment operator
         * 3.Relational operator
         * 4.Logical operator
         * 5.Unary operator
         * 6.Bitwise operator
        */

        // Java Arithmetic operators
        int a = 10,b = 20;
        System.out.println("a + b = " + (a + b)); // Addition 
        System.out.println("a - b = " + (a - b)); //Subtraction
        System.out.println("a * b = " + (a * b)); //Multiplication
        System.out.println("a / b = " + (a / b)); //Division

        // Java assignment operator -> They are used to assign values to variables
        // Java relational operators -> are used to check the relation between two operands

        int num1 = 300;
        int num2 = 600;
        System.out.println("num1 is " + num1  + " num2 is" + num2);
        System.out.println(num1==num2);
        System.out.println(num1!=num2);
        System.out.println(num1>num2);
        System.out.println(num2>num1);

        // Java logical operators -> they are used to check whether an expression is true or false.They are used in decision making
        System.out.println(num1 < num2 && num2 > num1); //AND OPERAND && - > true only if both expression1 and expression2 are true
        System.out.println(num1 < num2 || num2 < num1); //OR OPERAND || -> true if either expression1 or expression2 is true
        System.out.println(!(num1<num2)); //NOT OPERAND ! -> true if expression is false and vice versa


        // Increment and decrement operators
        int num3 = 10;
        int num4 = 20;
        
        int num3IncrementValue = ++num3;
        int num4DecrementValue = --num4;

        System.out.println("The incrementend value of nume3 is: " + num3IncrementValue);
        System.out.println("The decrement value of num4 is: " + num4DecrementValue);


        

    }
}