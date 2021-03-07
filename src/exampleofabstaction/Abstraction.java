package exampleofabstaction;

abstract class Lamp {  //Using abstract class for abstraction, objects can't be created from it

    public void turnOn() {
        System.out.println("Lamp is on");
    }

    public abstract void autoTurnOff(); //Abstract method
}

class TallLamp extends Lamp { //Must create a class that extends from abstract class to create objects
    public void autoTurnOff() {
        System.out.println("Automatically turning off at 10PM");
    }
}


class DeskLamp extends Lamp { //Must create a class that extends from abstract class to create objects
    public void autoTurnOff() {
        System.out.println("Automatically turning off at 9PM");
    }

}

class Abstraction {

    public static void main(String[] args) {
        TallLamp lounge = new TallLamp();
        lounge.turnOn();
        lounge.autoTurnOff();  /* This method is different for the different objects, as it is defined as an
abstract method in the abstract class, and redefined in the classes that extend the abstract class*/
        DeskLamp office = new DeskLamp();
        office.autoTurnOff();

    }


}
