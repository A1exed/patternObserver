package sample.app.component;

import javafx.scene.image.Image;

import java.io.File;

public class Eye {

    private boolean isOpened;

    private Image eye;

    private static final Image OPENED_EYE = new Image(new File("src/sample/app/component/asserts/opened_eye.png").toURI().toString());

    private static final Image CLOSED_EYE = new Image(new File("src/sample/app/component/asserts/closed_eye.png").toURI().toString());

    public Eye() {
        eye = OPENED_EYE;
        isOpened = true;
    }

    public Image getNextStateOfEye() {
        if (isOpened) {
            eye = CLOSED_EYE;
            isOpened = false;
        } else {
            eye = OPENED_EYE;
            isOpened = true;
        }
        return eye;
    }

    public Image getEye() {
        return eye;
    }
}
