class Calculator {
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int add(int num1, int num2) {
        return num1 - num2;
    }

    public double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public String add(String word1, String word2) {
        return word1 + word2;
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int res = obj.add(5, 6, 7);
        System.out.println(res);
        int res1 = obj.add(6, 5);
        System.out.println(res1);
        double res2 = obj.add(res, res1, 6);
        System.out.println(res2);
        String res3 = obj.add("Shiva", "Prasad");
        System.out.println(res3);
    }
}