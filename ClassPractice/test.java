// Interface
interface intexample {
    int add(int a, int b);
}

class test implements intexample {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        test t = new test();
        System.out.println("Sum = " +t.add(4,6));
    }
}