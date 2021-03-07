package exampleofconditionallogic;

class Logic {

    public static void main(String[] args) {

        //Example to show conditional variable assignment and calling and conditional logic using if and switch statements

        //setting up variables
        int num1 = 10;
        float num2 = 10.5f;
        float sweets = 3;
        float people = 4;

        //conditional assignment
        float biggerNum = num1 > num2 ? num1 : num2;
        System.out.println(biggerNum);

        //conditional assignment
        float numSweets = sweets < people ? 0.0f : sweets / people;
        System.out.println(numSweets);
        //otherwise we would end up with a decimal number of sweets per person
        numSweets = sweets / people;
        System.out.println(numSweets);

        //if-else statement
        if (num1 > num2)
            System.out.println("num1 is bigger");
        else if (num1 < num2)
            System.out.println("num2 is bigger");
        else
            System.out.println("num1 and num2 are equal");

        //block statements to group statements into a compound statement
        int num3 = 15, num4 = 20, diff;
        if (num3 > num4) {
            diff = num3 - num4;
            System.out.println("num3 is bigger");
            System.out.println(diff);
        } else if (num3 < num4) {
            diff = num4 - num3;
            System.out.println("num4 is bigger");
            System.out.println(diff);
        }

        //nested if statements
        float money = 24.0f, cost = 4.00f;
        if (money > 0.0f) {
            if (cost > 0.0f)
                System.out.println("You can afford " +money/cost); }
        else
            System.out.println("You have no money");

    }

}

