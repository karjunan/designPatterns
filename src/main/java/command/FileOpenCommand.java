package command;

public class FileOpenCommand implements Command {

    TextFile textFile;

    public FileOpenCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.fileOpen();
    }

}
