package observer;

public class Channel2 implements Observer {

    @Override
    public void notify(String message) {
        System.out.println("Note from channel 2  ==> " + message);
    }
}
