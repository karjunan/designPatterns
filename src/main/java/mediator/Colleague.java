package mediator;

public abstract class Colleague {

    private  Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    abstract String getName();

    abstract void receive(String message);

}
