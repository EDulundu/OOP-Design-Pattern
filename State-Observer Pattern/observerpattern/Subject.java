package observerpattern;

/**
 * Created by dulun on 12.12.2016.
 */
public interface Subject {

    void register(Observer o);

    void unregister(Observer o);

    void notifyObserver();
}
