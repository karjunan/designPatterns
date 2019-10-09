package mediator;

public class Colleague2Impl extends Colleague {

    private String name = "Colleague2";

    public Colleague2Impl(Mediator mediator) {
        super(mediator);
    }

    public void receive(String message) {
        System.out.println(message + " = received by " + name);
    }

    public String getName() {
        return name;
    }
}
