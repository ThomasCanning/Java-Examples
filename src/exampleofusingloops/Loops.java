package exampleofusingloops;

class Loops {

    public static void main(String[] args) {

        //using a while loop for factorial
        int n = 6;
        int factorial = 1;
        while (n > 1)                   //while n > 1 continue to loop
            factorial *= n--;           //factorial = factorial * n, then decrement n by 1
        System.out.println(factorial);

        //do-while loop, checks condition at end of loop so always executes at least once
        int iVal = 5;
        do {
            System.out.print(iVal); //doesn't got to a new line
            System.out.print(" * 2 = ");  //so printed on same line
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 100);

        //for loop, repeatedly excecutes a statement as long as the condition is true
        iVal = 1;
        //the following can be simplified as a for loop:
        while(iVal < 100) {
            System.out.println(iVal);
            iVal *= 2; }

        for (iVal = 1; iVal < 100; iVal *=2) //(initialise; condition; update) statement;
            System.out.println(iVal);


    }

}

