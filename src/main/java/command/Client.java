package command;

public class Client {

    public static void main(String[] args) {
        TextFile file = new TextFile();
        Command openCommand = new FileOpenCommand(file);
        Command saveCommand = new FileSaveCommand(file);
        Command closeCommand = new FileCloseCommand(file);

        Invoker invoker = new Invoker();
        invoker.setCommand(openCommand);
        invoker.executeOperation();
        invoker.setCommand(saveCommand);
        invoker.executeOperation();
        invoker.setCommand(closeCommand);
        invoker.executeOperation();
    }
}
