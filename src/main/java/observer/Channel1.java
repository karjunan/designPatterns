package observer;

public class Channel1 implements Observer {

    @Override
    public void notify(String message) {
        System.out.println("Note from channel 1 ==> " + message);
    }
}
