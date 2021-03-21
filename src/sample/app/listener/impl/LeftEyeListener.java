package sample.app.listener.impl;

import javafx.scene.image.ImageView;
import sample.app.component.Eye;
import sample.app.listener.Listener;

public class LeftEyeListener implements Listener {

    private final static String ID = "left_eye";

    private ImageView leftEye;

    private Eye eye;

    public LeftEyeListener(ImageView leftEye) {
        this.leftEye = leftEye;
        eye = new Eye();
        leftEye.setImage(eye.getEye());
    }

    @Override
    public void action(String id) {
        if (id.equals(ID))
            leftEye.setImage(eye.getNextStateOfEye());
    }
}
