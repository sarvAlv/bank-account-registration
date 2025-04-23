package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        Account account;
        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.nextLine().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(holder, number, initialDeposit);
        }
        else {
            account = new Account(holder, number);
        }
        System.out.println();
        System.out.println("Account data: %n" + account + "%n");

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.printf("Update account data: %n" + account + "%n");

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.printf("Update account data: %n" + account + "%n");

        sc.close();
    }
}
