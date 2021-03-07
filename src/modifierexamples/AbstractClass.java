package modifierexamples;

abstract class Horse {  /*The abstract modifier on a class means the class cannot be used to create objects
                         and can only be accessed through inheritance */
    public String name = "Champ";
    public int age = 14;
    public abstract void neigh();
}
class BabyHorse extends Horse {
    public String favouriteFood  = "Milk";
    public void neigh() { //This provides the body of the abstract method
        System.out.println("Neighhh");
    }
}

class Main {
    public static void main(String[] args) {
        // create an object of the BabyHorse class which inherits from Horse
        BabyHorse newHorse = new BabyHorse();

        System.out.println("Name: " + newHorse.name);
        System.out.println("Age: " + newHorse.age);
        System.out.println("Favourite food" + newHorse.favouriteFood);
        newHorse.neigh(); // call the abstract method
    }
}