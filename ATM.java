import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double balance = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Withdraw  2. Deposit  3. Check Balance: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: 
                System.out.print("Enter amount: ");
                double w = sc.nextDouble();
                if (w <= balance) balance -= w;
                else System.out.println("Insufficient balance");
                break;
            case 2: 
                System.out.print("Enter amount: ");
                balance += sc.nextDouble(); 
                break;
            case 3: 
                System.out.println("Balance: " + balance); 
                break;
        }
    }
}