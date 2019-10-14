package observer;

public interface Observable {

    public void notify(String message);

    public void save(Observer observer);
}
