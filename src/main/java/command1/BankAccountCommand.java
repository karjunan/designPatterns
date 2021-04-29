package command1;

public class BankAccountCommand implements Command {

    BankAccount ba;
    public enum TYPE {
        WITHDRAW, DEPOSIT
    }
    int amount;

    public BankAccountCommand(BankAccount ba, int amount, TYPE action) {
        this.ba = ba;
        this.amount = amount;
        this.action = action;
    }

    public TYPE action;
    public void execute() {
        switch(action) {
            case DEPOSIT:
                ba.deposit(amount);
                break;
            case WITHDRAW:
                ba.withdraw(amount);
                break;
        }
    }
}
