package command;

public class FileSaveCommand implements Command {

    TextFile textFile;

    public FileSaveCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    public void execute() {
        textFile.fileSave();
    }

}
