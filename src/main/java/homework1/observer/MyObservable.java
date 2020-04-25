package homework1.observer;

import java.util.LinkedList;

public class MyObservable {
    private final LinkedList<MyObserver> observers = new LinkedList<>();

    public void addObserver(MyObserver observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        observers.forEach(observer -> {
            observer.update(this);
        });
    }
}
