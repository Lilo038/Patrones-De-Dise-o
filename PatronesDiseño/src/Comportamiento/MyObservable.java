package Comportamiento;

public interface MyObservable {
    void subscirbe(MyObserver observer);
    void unsubscribe(MyObserver observer);
    void broadcast();
}
