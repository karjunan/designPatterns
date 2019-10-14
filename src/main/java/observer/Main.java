package observer;

public class Main {

    public static void main(String[] args) {

        Observer observer = new Channel1();
        Observer observer1 = new Channel2();

        Observable observable = new NewsObservable();
        observable.save(observer);
        observable.save(observer1);

        observable.notify(" Guys are you listening ");

    }
}
