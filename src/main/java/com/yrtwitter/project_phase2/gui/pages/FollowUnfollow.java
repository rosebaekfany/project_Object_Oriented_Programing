package com.yrtwitter.project_phase2.gui.pages;

import com.yrtwitter.project_phase2.controller.Communication;
import com.yrtwitter.project_phase2.gui.SearchIdSingle;
import com.yrtwitter.project_phase2.gui.SwitchScenes;
import com.yrtwitter.project_phase2.view.Input;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FollowUnfollow extends SwitchScenes implements Initializable {

    public void follow(ActionEvent event) throws IOException {
        Communication.followSb(Input.myRegister, Input.myRegister.allRegisters.get(Input.myRegister.logedInAccount), SearchIdSingle.myPersonPage.userID);
        switchScenes("myPage.fxml");
    }
    public void unfollow(ActionEvent event) throws IOException {
        Communication.unfollowSb(Input.myRegister, Input.myRegister.allRegisters.get(Input.myRegister.logedInAccount), SearchIdSingle.myPersonPage.userID);
        switchScenes("myPage.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}