//Calling Methods in java

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        // Calling a method without parameters
        main.printHello();

        // Calling a method with parameters
        main.printMessage("This is a message.");

        // Calling a method with a return type
        int sum = main.add(5, 3);
        System.out.println("Sum: " + sum);

        // Calling overloaded methods
        int productInt = main.multiply(2, 3);
        double productDouble = main.multiply(2.5, 3.5);
        System.out.println("Product (int): " + productInt);
        System.out.println("Product (double): " + productDouble);
    }

    public void printHello() {
        System.out.println("Hello, World!");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}
