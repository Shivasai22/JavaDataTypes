// # Multiple Exception

class exception2 {
    String name = "Bill";

    void showname() {
        System.out.println("Name is :" + name);

    }
}

class multipleex {
    public static void main(String args[]) {
        try {
            int a = 4, b = 2, c;
            c = a / b;
            System.out.println("c = " + c);
            exception2 obj = null;
            obj.showname();
        } catch (ArithmeticException ae) {
            System.out.println("Denominated can't be ZERO");

        } catch (NullPointerException ne) {
            System.out.println("Null reference has been used.");
        } catch (Exception e) {
            System.out.println("Unexpected error");
        }
    }
}