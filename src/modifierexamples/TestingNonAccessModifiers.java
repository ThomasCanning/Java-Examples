package modifierexamples;

final class TestingNonAccessModifiers {
    static void exampleMethod() {
        System.out.println("exampleMethod has been run");
    }

    int defaultInt = 10;
    final int finalInt = 20;


/* class Inheritance extends TestingNonAccessModifiers{} Would generate an error as the non-access modifier
final means that the class cannot be inherited by other classes
 */

    public static void main(String[] args) {
        TestingNonAccessModifiers object = new TestingNonAccessModifiers();
        object.exampleMethod();
        object.defaultInt = 50;
        System.out.println(object.defaultInt);

        //object.finalInt = 50;
        //System.out.println(object.finalInt);
        /*The above code would fail, as you cannot assign a value to a final varaible */

    }
}



