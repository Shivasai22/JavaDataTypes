class error1 {
    public static void main(String args[]) {
        int n = 20, no;
        try {
            no = n / 0;
        } catch (Exception e) {
            System.out.println("A number cannot be divided by 0");
        }
        System.out.println("Out if the try catch block");
    }
}