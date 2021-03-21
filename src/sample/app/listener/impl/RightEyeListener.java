package sample.app.listener.impl;

import javafx.scene.image.ImageView;
import sample.app.component.Eye;
import sample.app.listener.Listener;

public class RightEyeListener implements Listener {

    private final static String ID = "right_eye";

    private ImageView rightEye;

    private Eye eye;

    public RightEyeListener(ImageView rightEye) {
        this.rightEye = rightEye;
        eye = new Eye();
        rightEye.setImage(eye.getEye());
    }

    @Override
    public void action(String id) {
        if (id.equals(ID))
            rightEye.setImage(eye.getNextStateOfEye());
    }
}
