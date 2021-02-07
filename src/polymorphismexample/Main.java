package polymorphismexample;

public class Main {

    public static void main (String[] args) {
        SportsCar porsche911 = new SportsCar();   //creating objects of classes
        SuperCar lamborghiniHuracan = new SuperCar();
        PickupTruck teslaCybertruck = new PickupTruck();

        porsche911.speed();
        lamborghiniHuracan.speed();
        teslaCybertruck.speed();
        /*The same method is called for each of the subclasses, but due to polymorphism a
        different message is printed each time */

    }

}
