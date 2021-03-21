package sample.app.component;

import javafx.scene.image.Image;

import java.io.File;

public class Nose {

    private boolean isColored;

    private Image nose;

    private static final Image COLORED_NOSE = new Image(new File("src/sample/app/component/asserts/colored_nose.png").toURI().toString());

    private static final Image PURE_NOSE = new Image(new File("src/sample/app/component/asserts/nose.png").toURI().toString());

    public Nose() {
        nose = PURE_NOSE;
        isColored = false;
    }

    public Image getNextStateOfNose() {
        if (isColored) {
            nose = PURE_NOSE;
            isColored = false;
        } else {
            nose = COLORED_NOSE;
            isColored = true;
        }
        return nose;
    }

    public Image getNose() {
        return nose;
    }
}
