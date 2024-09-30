import java.util.ArrayList;
import java.util.Random;

public class Account {
    private Random rand = new Random();
    private final int seed = 1000000;
    public static ArrayList<Account> list = new ArrayList<>();

    String name;
    String nric;
    double balance;
    int accountNumber;

    public Account(String name, String nric) {
        this.name = name;
        this.nric = nric;
        this.balance = 0;
        this.accountNumber = rand.nextInt(seed);
        list.add(this);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void displayAccountInfo() {
        System.out.println("AccountNumber: " + accountNumber + "  Name: " + name + "  Balance: " + balance);
    }

    public static void main(String[] args) {

    }
}
