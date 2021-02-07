package modifierexamples;
/*This class is used to create variables with different access modifiers to see the effects they have
See TestClass2 to see this in action*/

class TestClass {
    public static int publicNumber = 20;  /*The static keyword allows the variable to be accessed from
    within the main method without an object of the class needed to be created*/

    private static int privateNumber = 25;
    protected static int protectedNumber = 30;
    static int defaultNumber = 10;

    public static void main(String[] args) {
        System.out.println(publicNumber);
        System.out.println(privateNumber);
        System.out.println(protectedNumber);
        /*As the main method is within the class, the variables with all access modifiers can be accessed*/


    }

}