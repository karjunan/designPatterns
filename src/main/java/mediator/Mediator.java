package mediator;

public interface Mediator {

    void send(String message, Colleague colleague);

    void addColleagues(Colleague colleague);
}
