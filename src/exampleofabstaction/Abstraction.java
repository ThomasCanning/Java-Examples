package exampleofabstaction;

abstract class Lamp {

    String room;

    public void turnOn() {
        System.out.println("Lamp is on");
    }
}

class TallLamp extends Lamp {

}

class Abstraction {

    public static void main(String[] args) {
        TallLamp lounge = new TallLamp();

    }


}
