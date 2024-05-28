public class nonprimitive {
    interface animal {
        void makeSound();
    }

    class Dog implements animal {
        public void makeSound() {
            System.out.println("Bark");
        }

    }
}
