package exampleofabstaction;

interface Doorbell {
void ring();
void camera();
void alarm();
}

class HighEnd implements Doorbell {
    public void ring() {
        System.out.println("The doorbell has been rung");
    }  //This is an example of overwritting

    public void camera() {
        System.out.println("The camera has been activated");
    }

    public void alarm() {
        System.out.println("Suspicious activity detected");
    }
}
class Interfaces {
    public static void main(String[] args) {
        HighEnd frontDoor = new HighEnd();
        frontDoor.ring();
        frontDoor.camera();
    }
}
