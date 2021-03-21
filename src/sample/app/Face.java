package sample.app;

import sample.app.listener.Listener;
import sample.app.listener.Listeners;

public class Face {
    private Listeners listeners;

    public Face() {
        listeners = new Listeners();
    }

    public void addListener(Listener listener) {
        listeners.subscribe(listener);
    }

    public void removeListener(Listener listener) {
        listeners.unsubscribe(listener);
    }

    public void action(String actor) {
        listeners.notify(actor);
    }
}
