package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dulun on 12.12.2016.
 */
public class HiTech implements Subject {

    private List<Observer> observers;

    private boolean flag;

    public HiTech(){

        this.flag = false;
        observers = new ArrayList<Observer>();
    }

    public boolean changeDetected(boolean flag){

        this.flag = flag;

        notifyObserver();

        return this.flag;
    }

    @Override
    public void register(Observer o) {

        observers.add(o);

        System.out.println("Bir Traffic Light Observer Eklendi.");
    }

    @Override
    public void unregister(Observer o) {

        int observerIndex = observers.indexOf(o);

        System.out.println("Bir Traffic Light Observer " + (observerIndex + 1) + " sirasindaki silindi.");

        observers.remove(o);
    }

    @Override
    public void notifyObserver() {

        for (Observer observer : observers){
            observer.update(flag);
        }
    }
}
