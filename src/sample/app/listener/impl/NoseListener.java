package sample.app.listener.impl;

import javafx.scene.image.ImageView;
import sample.app.component.Nose;
import sample.app.listener.Listener;

public class NoseListener implements Listener {

    private final static String ID = "nose";

    private ImageView noseView;

    private Nose nose;

    public NoseListener(ImageView nose) {
        noseView = nose;
        this.nose = new Nose();
        nose.setImage(this.nose.getNose());
    }

    @Override
    public void action(String id) {
        if (id.equals(ID))
            noseView.setImage(nose.getNextStateOfNose());
    }
}
