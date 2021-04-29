package command1;

public class BankAccount {

    int balance = 0;
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Amount deposited is "+ amount + " , and the balance is "+ balance);
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Amount withdrawn is "+ amount + ", and the balance is "+ balance);
    }
}
