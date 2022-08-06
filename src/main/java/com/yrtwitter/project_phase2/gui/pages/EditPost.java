package com.yrtwitter.project_phase2.gui.pages;

import com.yrtwitter.project_phase2.gui.SwitchScenes;
import com.yrtwitter.project_phase2.media.Post;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.yrtwitter.project_phase2.gui.pages.BasePost.myShowPost;
import static com.yrtwitter.project_phase2.view.Input.myRegister;

public class EditPost extends SwitchScenes implements Initializable {

    @FXML
    TextField editedText ;


    public void edit_post(ActionEvent event) throws IOException {
        String newText = editedText.getText() ;
        Post.editPost(myShowPost,newText);

    }

    public void delete_post(ActionEvent event) throws IOException {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}