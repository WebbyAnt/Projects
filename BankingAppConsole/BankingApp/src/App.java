import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        byte choice;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Choose from the options");
            System.out.println("---------------------");
            System.out.println("1. Open Account");
            System.out.println("2. List all accounts");
            System.out.println("3. View Account Details");
            System.out.println("4. Delete an account");
            System.out.println("5. Deposit");
            System.out.println("6. Withdraw");
            System.out.println("7. Exit");

            choice = input.nextByte();

            if (choice == 1) {
                Utility.openAccount();
                continue;
            }

            if (choice == 2) {
                Utility.listAllAccount();
                continue;
            }

            if (choice == 3) {
                Utility.displayAccountInfo();
                continue;
            }

            if (choice == 4) {
                Utility.closeAccount();
                continue;
            }

            if (choice == 5) {
                Utility.deposit();
                continue;
            }

            if (choice == 6) {
                Utility.withdraw();
                continue;
            }

            if (choice == 7) {
                System.out.println("Bye! Bye!");
                break;
            }

            if (!input.hasNext()) {
                input.close();
            }

        }

    }
}
