
package Comportamiento;

import java.util.ArrayList;
import java.util.List;

public class Vigilant extends Enemy implements MyObservable {
    
    private List<MyObserver> observers = new ArrayList<>();
    
    
    public Vigilant(String name) {
        super(name);
        setActive(true);
    }

    @Override
    public void attack() {
        System.out.println(getName()+" Vigilant on Attakc!");
    }

    @Override
    public void activate() {
        System.out.println(getName()+" sending Messages");
        broadcast();
    }

    @Override
    public void subscirbe(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(MyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void broadcast() {
        for (MyObserver observer: observers)
            observer.update();
    }
    
}
