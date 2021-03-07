package polymorphismexample;

public class SportsCar extends Vehicle{ //This is a subclass and inherits from the parent class
    public void speed() {
        System.out.println("This vehicle has top speed of 150mph");
    }
    //Above is the principle of polymorphism, where the same method has a different result depending on which object
    //from which class it is called from
}
