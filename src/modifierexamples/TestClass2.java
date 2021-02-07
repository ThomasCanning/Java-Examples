
package modifierexamples;

class TestClass2 {

    public static void main(String[] args) {
        System.out.println(TestClass.publicNumber);/*As TestClass is public, the
        variable public number can be accessed by a different class in the same package, but not in a different
        package as TestClass has the default modifier so can't be accessed out of the package*/

        System.out.println(TestClass.defaultNumber);/*Defaultnumber can also be printed from a different class
        in the same package, as the default modifier means the code is only accessible by classes in the same package*/

        System.out.println(TestClass.protectedNumber);//The protected variables are accessible in the same package and subclasses

        /* System.out.println(TestClass.privateNumber);
        As privateNumber has the access modifier private, if it were to be not commented and run, the code
        would fail as attributes with the private access modifier are only accessible within the declared class*/



    }
}