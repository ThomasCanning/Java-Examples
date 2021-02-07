package InheritanceExample;

public class Main {

    public static void main (String [] args) {
        Sidekick sidekick1 = new Sidekick();

        sidekick1.healthBoost(50); //This method is a method of the superclass (parent) Player
        sidekick1.attack();//As Sidekick class extends, player, methods from the parent class are inherited
        //This is inheritance

    }
}
