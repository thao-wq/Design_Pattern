package observer;

import java.util.ArrayList;
import java.util.List;

public class Connection implements Subject {

    private String status;

    private List<Observer> observers;

    public Connection() {
        observers = new ArrayList<>();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;

        notifyObservers();
    }

    @Override
    public void add(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        for (Observer o : observers) {
            o.update(status);
        }
    }
}