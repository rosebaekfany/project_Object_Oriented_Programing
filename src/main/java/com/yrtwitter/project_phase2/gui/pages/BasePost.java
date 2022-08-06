package com.yrtwitter.project_phase2.gui.pages;

import com.yrtwitter.project_phase2.Main;
import javafx.fxml.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class BasePost implements Initializable{
    @FXML
    VBox top ;
    @FXML
    VBox buttom ;
    @FXML
    ImageView image ;

    public static com.yrtwitter.project_phase2.media.Post myShowPost = new  com.yrtwitter.project_phase2.media.Post() ;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FXMLLoader topLoader = new FXMLLoader(Main.class.getResource("postTop.fxml"));
        try {
            top.getChildren().add(topLoader.load());
        }catch (Exception e){
            e.printStackTrace();
        }
        FXMLLoader buttomLoader = new FXMLLoader(Main.class.getResource("postUnder.fxml"));
        try {
            buttom.getChildren().add(buttomLoader.load());
        }catch (Exception e){
            e.printStackTrace();
        }
        FXMLLoader editLoader = new FXMLLoader(Main.class.getResource("editPost.fxml"));
        try {
            buttom.getChildren().add(editLoader.load());
        }catch (Exception e){
            e.printStackTrace();
        }

        Image myImage = new Image(getClass().getResourceAsStream("/images/rose-flower.jpg"));
        image.setImage(myShowPost.postImage);

    }
}