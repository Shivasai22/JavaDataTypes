//Methods in java 
public class Bank {
    static int currentBalance = 1000;

    public static void greetCustomer() {
        System.out.println("Welcome to the bank");
    }

    public void deposit(int amount) {
        currentBalance = currentBalance + amount;
        System.out.println("Amount is deposited successfully");
    }

    public static void withdraw(int amount) {
        currentBalance = currentBalance - amount;
        System.out.println("Amount is withdrawn successfully");
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public static void main(String[] args) {
        greetCustomer();
        Bank bank = new Bank();
        System.out.println("Current balance is : " + bank.getCurrentBalance());

        bank.deposit(500);
        System.out.println("Current balance is : " + bank.getCurrentBalance());
        withdraw(200);
        System.out.println("Current balance is : " + bank.getCurrentBalance());
       
    }

}