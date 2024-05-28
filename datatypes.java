import java.util.ArrayList;
import java.util.List;

public class datatypes {
    public static void main(String[] args) {
        byte age = 23;
        short year = 2024;
        int salary = 15000;
        long distance = 200l;
        float temp = 36.8f;
        double pi = 3.14159;
        boolean isJavaFun = true;
        char grade = 'A';

        System.out.println(age);
        System.out.println(year);
        System.out.println(salary);
        System.out.println(distance);
        System.out.println(temp);
        System.out.println(pi);
        System.out.println(isJavaFun);
        System.out.println(grade);

        // non primitive data types
        // array
        int[] number = { 1, 2, 3, 4, 5 };
        System.out.println(number[0]);

        // Collections
        List<String> names = new ArrayList<>();
        names.add("Shiva");
        names.add("Prasad");
        System.out.println(names);

        // Interfaces
        // interface animal {
        // void makeSound();
        // }
        // class Dog implements animal {
        // public void makeSound() {
        // System.out.println("Bark");
        // }

        // }

    }
}
