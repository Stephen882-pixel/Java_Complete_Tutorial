class JavaVariable{
    public static void main(String[] args) {
        int speedlimit = 80;
        System.out.println(speedlimit);
        int marks;
        marks = 400;
        System.out.println(marks);
        // change values of variables
        marks = 450;
        System.err.println(marks);

        /*Rules for naming variables in java:
         * 1. java is case sensitive hence age and AGE are two completely diff variables
         * 2.Variables must only start with either a letter,an underscore or a dollara sign
         * 3.Variable names cannot start with numbers
         * 4.variable names cannot use white space
        */

        /*LITERALS : Integer Literals -> They are numeric values without any fractional or exponential part.There
         * are four types of integer literals:Binary(base2),Decimal(base10),octal(base8) and hexadecimal(base16)
        */
        int binaryNumber = 0b10010; // binary number start with 0b
        int octalNumber = 027; // Octal number starts with 0
        int decNumber = 34; 
        int hexNumber = 0x2F; //hexadecimal starts with 0x
        System.out.println(binaryNumber);
        System.out.println(octalNumber);
        System.out.println(decNumber);
        System.out.println(hexNumber);
        
        // Floating point literals - They are numeric literals thatt eithe have fractional or exponential part 
        double myDouble = 3.4;
        float myFloat = 3.4F;
        System.out.println(myDouble);
        System.out.println(myFloat);

        // Character Literal - are unicode characters enclosed inside single quotes
        char letter = 'a';
        System.out.println(letter);
        // String literals - is a sequence of characters enclosed inside double quotes 
        String string1 = "My name is Ondeyo Stephen Omondi";
        String string2 = "I am a backend engineer";
        System.out.println(string1);
        System.out.println(string2);
        // Boolean literals 
        boolean status1 = true;
        boolean status2 = false;
        System.out.println(status1);
        System.out.println(status2);
    }
}


