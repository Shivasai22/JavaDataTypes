class exception {
    public static void main(String args[]) {
        int x = 10, p;
        try {
            p = x / 0;
        } catch (Exception e) {
            System.out.println("A number cannot be divided by 0");
        }
        System.out.println("Out of the try-catch block");
    }
}