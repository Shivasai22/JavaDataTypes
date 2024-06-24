class excepdemo3 {

    public static void main(String args[]) {
        try {
            int val = 0;
            val = Integer.parseInt(args[0]);
            System.out.println("No exception raised "+val);
        } catch (NumberFormatException ne) {
            System.out.println("Exception is catched");
        } finally {
            System.out.println("Finally block is executed");
        }
    }
}