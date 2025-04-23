package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double balance = 0;


        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        Account account = new Account(holder, number);
        System.out.print("Is there na initial deposit (y/n)? ");
        String r = sc.nextLine();
        if (r.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
            account.setBalance(balance);
        }
        System.out.println();
        System.out.printf("Account data: %n" + account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        balance = sc.nextDouble();
        account.deposit(balance);
        System.out.printf("Update account data: %n" + account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        balance = sc.nextDouble();
        account.withdraw(balance);
        System.out.printf("Update account data: %n" + account);

        sc.close();
    }
}
