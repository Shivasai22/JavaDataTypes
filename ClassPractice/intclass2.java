interface intone {
    int add(int a, int b);
}

interface inttwo {
    int sub(int a, int b);
}

interface intthree {
    int mul(int a, int b);
}

class intclass2 implements intone, inttwo, intthree {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return (a - b);
    }

    public int mul(int a, int b) {
        return (a * b);
    }

    public static void main(String args[]) {
        intclass2 obj = new intclass2();
        System.out.println("Sum = " + obj.add(4, 5));
        System.out.println(" Difference = " + obj.sub(4, 5));
        System.out.println("Product= " + obj.mul(4, 5));
    }
}