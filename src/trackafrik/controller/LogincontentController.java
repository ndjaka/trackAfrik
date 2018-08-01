/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.zilabs.multiscreenframework.core.ScreenLoader;
import com.zilabs.multiscreenframework.interfaces.IScreenController;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import trackafrik.TrackAfrik;

/**
 * FXML Controller class
 *
 * @author ndjaka
 */
public class LogincontentController implements Initializable, IScreenController {

    /**
     * Initializes the controller class.
     */
      @FXML
    private AnchorPane anchorpane;
        @FXML
    private JFXTextField id_login;

    @FXML
    private JFXPasswordField id_mdp;
       private ScreenLoader loader;

    @FXML
   public void connecter() throws IOException {
      AnchorPane root = FXMLLoader.load(getClass().getResource(("/trackafrik/View/FXMLSIDEBAR.fxml")));
      
       Stage stage = new Stage();
       //stage.setResizable(false);
       stage.setFullScreen(true);
       InputStream is = getClass().getResourceAsStream("/trackafrik/images/logo.png");
       stage.getIcons().add(new Image(is));
       stage.setScene(new Scene(root,1500,685));
       stage.show();
      TrackAfrik.win.close();
       
//         AnchorPane pane = FXMLLoader.load(getClass().getResource(("/trackafrik/View/FXMLSIDEBAR.fxml")));
//         
//          pane.setPrefWidth(1500);
//          pane.setPrefHeight(685);
//          anchorpane.getChildren().setAll(pane);
       
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void setScreenParent(ScreenLoader loader) {
        this.loader = loader;
    }
    
}
