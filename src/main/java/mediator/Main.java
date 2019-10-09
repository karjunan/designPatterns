package mediator;

public class Main {


    public static void main(String[] args) {

        Mediator mediator = new MediatorImpl();
        mediator.addColleagues(new Colleague1Impl(mediator));
        mediator.addColleagues(new Colleague2Impl(mediator));
        mediator.addColleagues(new Colleague3Impl(mediator));

        Colleague colleague1 = new Colleague1Impl(mediator);
        colleague1.send("Hai buddy ");;

    }
}
