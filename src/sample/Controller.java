package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.app.Face;
import sample.app.listener.Listener;
import sample.app.listener.impl.LeftEyeListener;
import sample.app.listener.impl.MouthListener;
import sample.app.listener.impl.NoseListener;
import sample.app.listener.impl.RightEyeListener;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ImageView leftEye;

    @FXML
    private ImageView rightEye;

    @FXML
    private ImageView nose;

    @FXML
    private ImageView mouth;

    private Face face;

    private Listener leftEyeListener;

    private Listener rightEyeListener;

    private Listener noseListener;

    private Listener mouthListener;

    @FXML
    private void leftEyeAction() {
        face.action("left_eye");
    }

    @FXML
    private void rightEyeAction() {
        face.action("right_eye");
    }

    @FXML
    private void noseAction() {
        face.action("nose");
    }

    @FXML
    private void mouthAction() {
        face.action("mouth");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        leftEyeListener = new LeftEyeListener(leftEye);
        rightEyeListener = new RightEyeListener(rightEye);
        noseListener = new NoseListener(nose);
        mouthListener = new MouthListener(mouth);
        face = new Face();
        face.addListener(leftEyeListener);
        face.addListener(rightEyeListener);
        face.addListener(noseListener);
        face.addListener(mouthListener);
    }
}
