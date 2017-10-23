package controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private ImageView img0;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img1;
    private Image m_image;

    public void initialize(){

    }

    public void hoverEnter(){
        m_image = img2.getImage();
        img2.setImage(img0.getImage());
    }

    public void hoverExit(){
        img2.setImage(m_image);
    }
}
