package gettersandsetters;

public class TestClass {
    private int num1 = 10;
    private static int num2 = 5;

    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1=num1;
    }
    public static int getNum2(){
        return num2;
    }
    public void setNum2(int num2){
        this.num1=num2;
    }
}

class TestClass2 {

    public static void main(String[] args) {
        TestClass class1 = new TestClass(); //Creating instance of class
        System.out.println(class1.getNum1());  //Using getter to print private num 1
        class1.setNum1(2);  //Using setter to set num1 in instance of class
        int newNum = class1.getNum1();  //Assigning variable to num1 in TestClass object
        System.out.println(newNum);

        System.out.println(TestClass.getNum2());
    }
}
