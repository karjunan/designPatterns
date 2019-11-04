package chainOfResponsibility;

public interface Handler {

    public void setClient(Handler handler);

    public void execute(Request request);
}
