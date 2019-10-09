package mediator;

public class Colleague1Impl extends Colleague {

    private String name = "Colleague1";

    public Colleague1Impl(Mediator mediator) {
        super(mediator);
    }

    public void receive(String message) {
        System.out.println(message + " = received by " + name);
    }

    public String getName() {
        return name;
    }
}
