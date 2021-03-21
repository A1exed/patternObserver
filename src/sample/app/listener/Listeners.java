package sample.app.listener;

import java.util.ArrayList;
import java.util.List;

public class Listeners {

    private List<Listener> listeners;

    public Listeners() {
        listeners = new ArrayList<>();
    }

    public void subscribe(Listener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(Listener listener) {
        listeners.remove(listener);
    }

    public void notify(String id) {
        for (Listener listener : listeners) {
            listener.action(id);
        }
    }
}
