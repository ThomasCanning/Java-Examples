package overriding;

class OverridingExample {

    static class Animal{
        static void age(int animalAge) {
            System.out.println("This animal is " + animalAge + " years old");
        }
    }

    static class Lion extends Animal {
        static void age(int animalAge) { System.out.println("This Lion is " + animalAge + " years old");}
    }

    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Lion lion = new Lion();

        genericAnimal.age(10);
        lion.age(8);


    }
}
