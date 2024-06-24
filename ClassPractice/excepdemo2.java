class excepdemo2 {
    public static void main(String args[]) {
        try {
            int a = 4, b = 0, c;
            c = a / b;
            System.out.println("c = " + c);
        } catch (Exception obj) {
            System.out.println(obj.toString());

            System.out.println("Out of the try catch block");
        }
    }

}