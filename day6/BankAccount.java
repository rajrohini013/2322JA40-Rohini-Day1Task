package day6;

class Bank {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        String user = Thread.currentThread().getName();
        System.out.println(user + " trying to withdraw ₹" + amount);

        try {
            Thread.sleep(500); 
        } catch (Exception e) {}

        if (balance >= amount) {
            balance -= amount;
            System.out.println(user + " withdrew ₹" + amount);
        } else {
            System.out.println("Not enough balance for " + user);
        }

        System.out.println("Balance left: ₹" + balance);
        System.out.println();
    }
}

class User extends Thread {
    Bank bank;
    int amount;

    User(Bank bank, int amount, String name) {
        super(name);
        this.bank = bank;
        this.amount = amount;
    }

    public void run() {
        bank.withdraw(amount);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank bank = new Bank();

        new User(bank, 400, "User1").start();
        new User(bank, 500, "User2").start();
        new User(bank, 300, "User3").start();
    }
}
