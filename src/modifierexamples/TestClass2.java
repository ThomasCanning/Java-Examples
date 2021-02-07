
package modifierexamples;

public class TestClass2 {

    public static void main(String[] args) {
        System.out.println(TestClass.publicNumber);/*As TestClass is public, the
        variable public number can be accessed by a different class in the same package, but not in a different
        package as TestClass has the default modifier so can't be accessed out of the package*/

        System.out.println(TestClass.defaultNumber);

    }
}