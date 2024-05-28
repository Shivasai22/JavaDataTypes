public class nonprimitive {

    interface animal {
        void makeSound();
    }

    class Dog implements animal {
        public void makeSound() {
            System.out.println("Bark");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        nonprimitive outer = new nonprimitive();

        // Use the outer class instance to create an instance of the inner class
        Dog myDog = outer.new Dog();

        // Call the makeSound() method on the object
        myDog.makeSound();
    }
}
