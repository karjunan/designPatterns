package command;

public class FileCloseCommand implements Command {

    TextFile textFile;

    public FileCloseCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    public void execute() {
        textFile.fileClose();
    }

}
