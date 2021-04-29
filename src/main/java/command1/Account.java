package command1;

import java.util.ArrayList;
import java.util.List;

public class Account {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        Command command = new BankAccountCommand(ba, 100,BankAccountCommand.TYPE.DEPOSIT);
        Command command1 = new BankAccountCommand(ba, 50,BankAccountCommand.TYPE.WITHDRAW);
        List<Command> commandList = new ArrayList<Command>();
        commandList.add(command);
        commandList.add(command1);
        for(Command c: commandList) {
            c.execute();
        }
    }
}
