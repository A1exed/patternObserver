package sample.app.listener.impl;

import javafx.scene.image.ImageView;
import sample.app.component.Mouth;
import sample.app.listener.Listener;

public class MouthListener implements Listener {

    private final static String ID = "mouth";

    private ImageView mouthView;

    private Mouth mouth;

    public MouthListener(ImageView mouth) {
        mouthView = mouth;
        this.mouth = new Mouth();
        mouth.setImage(this.mouth.getMouth());
    }

    @Override
    public void action(String id) {
        if (id.equals(ID))
            mouthView.setImage(mouth.getNextStateOfMouth());
    }
}
