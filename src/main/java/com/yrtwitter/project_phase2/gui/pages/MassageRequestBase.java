package com.yrtwitter.project_phase2.gui.pages;

import com.yrtwitter.project_phase2.Main;
import com.yrtwitter.project_phase2.controller.Commercial;
import com.yrtwitter.project_phase2.gui.SearchIdSingle;
import com.yrtwitter.project_phase2.gui.SwitchScenes;
import com.yrtwitter.project_phase2.gui.menu.OnPage;
import com.yrtwitter.project_phase2.view.Input;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MassageRequestBase extends SwitchScenes implements Initializable {

    @FXML
    VBox requestBox;

    public static int requestIndex ;

    public void backToPage(ActionEvent event) throws IOException {
        if(Input.myRegister.allRegisters.get(Input.myRegister.logedInAccount).userID.equals(SearchIdSingle.myPersonPage.userID)){
            onPage = OnPage.MY_PAGE;
        }
        else {
            onPage = OnPage.SBS_PAGE;
        }
        switchScenes("main_page.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(requestBox!=null) {
            for (requestIndex=SearchIdSingle.myPersonPage.massageRequests.size()-1 ; requestIndex>=0; requestIndex--) {
                FXMLLoader requestt ;
                if (!SwitchScenes.darkTheme) {
                    requestt = new FXMLLoader(Main.class.getResource("massageRequestSingleLight.fxml"));
                } else {
                    requestt = new FXMLLoader(Main.class.getResource("massageRequestSingle.fxml"));
                }
                try {
                    requestBox.getChildren().add(requestt.load());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
