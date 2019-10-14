package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsObservable implements Observable {

    List<Observer> channels = new ArrayList<>();


    public void save(Observer observer) {
        channels.add(observer);
    }

    @Override
    public void notify(String message) {
     for(Observer observer : channels) {
         observer.notify(message);
     }

    }
}
