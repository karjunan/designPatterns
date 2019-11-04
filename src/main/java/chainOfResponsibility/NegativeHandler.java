package chainOfResponsibility;

public class NegativeHandler implements Handler {

    private Handler handler;

    public NegativeHandler() {
    }

    @Override
    public void setClient(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void execute(Request data) {

        if(data.data < 0) {
            System.out.println("Handled by Negative Handler");
        } else if(data.data > 0) {
            handler = new PositiveHandler();
        } else {
            handler = new ZeroHandler();
        }
    }
}
