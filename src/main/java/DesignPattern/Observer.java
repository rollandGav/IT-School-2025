package DesignPattern;

import java.util.ArrayList;
import java.util.List;

interface ObserverInt {
    void update(String message);
}

class NewSubscriber implements ObserverInt {
    private String name;

    public NewSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " a primit stirea: " + message);
    }
}


class NewAgency {
    List<ObserverInt> observers = new ArrayList<>();

    public void addObserver(ObserverInt o) {
        observers.add(o);
    }

    public void publishNews(String message) {
        for (ObserverInt obs : observers) {
            obs.update(message);
        }
    }
}

public class Observer {
    public static void main(String... a) {
        NewAgency agency = new NewAgency();
        NewSubscriber s1 = new NewSubscriber("Marcel");
        NewSubscriber s2 = new NewSubscriber("Petre");
        agency.addObserver(s1);
        agency.addObserver(s2);
        agency.publishNews("A aparut o noua versiune de Java!");
    }
}