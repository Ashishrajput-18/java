package Case_Study_2;

import java.util.Scanner;

class Account {

    String accountNumber;
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = new Account();

        System.out.print("Enter account number: ");
        account.accountNumber = sc.nextLine();

        System.out.print("Enter account holder name: ");
        account.accountHolderName = sc.nextLine();

        System.out.print("Enter initial balance: ");
        account.balance = sc.nextDouble();

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("\n----- Account Details -----");
        account.displayBalance();

        sc.close();
    }
}
