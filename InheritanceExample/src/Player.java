public class Player {  //This is the superclass
    String name = "Stickman";        // Vehicle attribute
    public static void healthBoost(int boostAmount) {                    // Vehicle method
        System.out.println("Health has been boosted by " + boostAmount);
    }
    public static void attack() {
        System.out.println("Attacking");  //These methods are use by the subclass
    }
}