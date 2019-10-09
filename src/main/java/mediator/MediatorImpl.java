package mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {

    List<Colleague> colleagueArrayList = new ArrayList();

    public void addColleagues(Colleague colleague) {
        colleagueArrayList.add(colleague);
    }

    public void send(String message, Colleague colleague) {

        for(Colleague clg : colleagueArrayList) {
            if(colleague.getName() != clg.getName())
                clg.receive(message);
        }
    }
}
