import java.util.Scanner;

public class Utility {

    public static final Scanner input = new Scanner(System.in);

    public static void openAccount() {
        System.out.println("Enter Name");
        String name = input.next();
        System.out.println("Enter NRIC");
        String nric = input.next();
        Account account = new Account(name, nric);
        account.displayAccountInfo();
    }

    public static void closeAccount() {
        System.out.println("Enter Account Number");
        int accountNumber = input.nextInt();
        try {
            Service.deleteAccount(accountNumber);
            System.out.println("Account Number: " + accountNumber + " Successfully Closed");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void displayAccountInfo() {
        System.out.println("Enter Account Number");
        int accountNumber = input.nextInt();
        Service.displayAccountInfo(accountNumber);
    }

    public static void deposit() {
        System.out.println("Enter Account Number");
        int accountNumber = input.nextInt();
        System.out.println("Enter Amount");
        double amount = input.nextDouble();
        Service.deposit(accountNumber, amount);
    }

    public static void withdraw() {
        System.out.println("Enter Account Number");
        int accountNumber = input.nextInt();
        System.out.println("Enter Amount");
        double amount = input.nextDouble();
        Service.withdraw(accountNumber, amount);
    }

    public static void listAllAccount() {
        Service.displayAllAccountInfo();
    }

    public static void main(String[] args) {
        openAccount();
    }
}
