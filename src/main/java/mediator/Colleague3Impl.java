package mediator;

public class Colleague3Impl extends Colleague {

    private String name = "Colleague3";

    public Colleague3Impl(Mediator mediator) {
        super(mediator);
    }

    public void receive(String message) {
        System.out.println(message + " = received by " + name);
    }

    public String getName() {
        return name;
    }
}
