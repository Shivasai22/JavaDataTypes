// Arithmetic Operators
public class Operators {
    public static void main(String[] args) {
        int a = 50;
        int b = 35;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Unary Operators
        System.out.println(a);
        System.out.println(++a);// preIncrement
        System.out.println(a++);// postIncrement
        System.out.println(a);

        System.out.println(b);
        System.out.println(--b);// preDecrement
        System.out.println(b--);// postDecrement
        System.out.println(b);

        // Relational Operators
        System.out.println(a == b);// equal to
        System.out.println(a != b);// not equal to
        System.out.println(a > b);// greater than
        System.out.println(a < b);// less than
        System.out.println(a >= b);// grater than or equal to
        System.out.println(a <= b); // less than or equal to

        // Conditional Operators
        System.out.println(a < b && a == b);// false
        System.out.println(a < b || a == b);// false

        // Logical Operators
        // System.out.println(true && true);// true
        // System.out.println(true && false);// false
        // System.out.println(true || true);// true
        // System.out.println(true || false);// true
        // System.out.println(!true);// false
        // System.out.println(!false);// true

        // Assignment Operators
        int c = 20;
        int d = 20;
        int e = 20;
        int f = 20;
        int g = 20;
        c += 10;
        d -= 10;
        e *= 10;
        f /= 10;
        g %= 10;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        int i = 50;

        int h = i-- - --i;
        System.out.println(h);
    }
}