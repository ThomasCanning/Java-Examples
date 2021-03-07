package overloading;

class Pig {
    public void oink(){  //Example of overloading by creating two oink methods using different parameters
        System.out.println("Oink Oink!");
    }
    public void oink(int num){
        for(int i=0; i<num; i++)
            System.out.println("Oink");
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.oink(); //Running methods
        pig.oink(3);
    }
}
