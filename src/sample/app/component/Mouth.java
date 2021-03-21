package sample.app.component;

import javafx.scene.image.Image;

import java.io.File;

public class Mouth {

    private boolean isSmiled;

    private Image mouth;

    private static final Image SMILE = new Image(new File("src/sample/app/component/asserts/smile.png").toURI().toString());

    private static final Image MOUTH = new Image(new File("src/sample/app/component/asserts/mouth.png").toURI().toString());

    public Mouth() {
        mouth = MOUTH;
        isSmiled = false;
    }

    public Image getNextStateOfMouth() {
        if (isSmiled) {
            mouth = MOUTH;
            isSmiled = false;
        } else {
            mouth = SMILE;
            isSmiled = true;
        }
        return mouth;
    }

    public Image getMouth() {
        return mouth;
    }
}
