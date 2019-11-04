package chainOfResponsibility;

public class ZeroHandler implements Handler {

    private Handler handler;

    @Override
    public void setClient(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void execute(Request request) {

        if(request.data == 0 )
        {
            System.out.println("Handled by zero handler");
        } else if( request.data < 0) {
            handler = new NegativeHandler();
        } else {
            handler = new PositiveHandler();
        }
    }
}
