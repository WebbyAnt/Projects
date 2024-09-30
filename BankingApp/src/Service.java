import java.util.NoSuchElementException;

public class Service {

    private static Account getAccount(int accountNumber) {
        Account account = Account.list.stream().filter(a -> a.accountNumber == accountNumber).findFirst().get();
        return account;
    }

    public static void displayAccountInfo(int accountNumber) {
        try {
            Account account = getAccount(accountNumber);
            account.displayAccountInfo();
        } catch (NoSuchElementException e) {
            System.out.println("Not Found AccountNumber: " + accountNumber);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void deleteAccount(int accountNumber) {
        try {
            Account account = getAccount(accountNumber);
            Account.list.remove(account);
        } catch (NoSuchElementException e) {
            System.out.println("Not Found AccountNumber: " + accountNumber);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void withdraw(int accountNumber, double amount) {
        if (amount < 0) {
            System.out.println("Negative Amount");
            return;
        }

        try {
            Account account = getAccount(accountNumber);
            account.withdraw(amount);
            account.displayAccountInfo();
        } catch (NoSuchElementException e) {
            System.out.println("Not Found AccountNumber: " + accountNumber);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void deposit(int accountNumber, double amount) {
        if (amount < 0) {
            System.out.println("Negative Amount");
            return;
        }

        try {
            Account account = getAccount(accountNumber);
            account.deposit(amount);
            account.displayAccountInfo();
        } catch (NoSuchElementException e) {
            System.out.println("AccountNumber: " + accountNumber + " Not Found");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void displayAllAccountInfo() {

        if (Account.list.size() == 0) {
            System.out.println("No Accounts");
            return;
        }

        for (Account account : Account.list) {
            account.displayAccountInfo();
        }
    }

}
