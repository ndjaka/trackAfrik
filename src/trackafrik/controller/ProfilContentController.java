/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.controller;

import com.jfoenix.controls.JFXButton;
import com.zilabs.multiscreenframework.core.ScreenLoader;
import com.zilabs.multiscreenframework.interfaces.IScreenController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author ndjaka
 */
public class ProfilContentController implements Initializable, IScreenController {

    /**
     * Initializes the controller class.
     */
     @FXML
    private JFXButton openMagasinier;
     
    @FXML
    private AnchorPane rootpane;

    @FXML
    void openClient(ActionEvent event) throws IOException {
          AnchorPane pane = FXMLLoader.load(getClass().getResource("/trackafrik/View/clientContent.fxml"));
          pane.setPrefWidth(1200);
          pane.setPrefHeight(542);
          rootpane.getChildren().setAll(pane);
    }

    @FXML
    void openFournisseur(ActionEvent event) throws IOException {
          AnchorPane pane = FXMLLoader.load(getClass().getResource("/trackafrik/View/fournisseurContent.fxml"));
            pane.setPrefWidth(1200);
          pane.setPrefHeight(542);
          rootpane.getChildren().setAll(pane);
    }

    @FXML
    void openGrossiste(ActionEvent event) throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/trackafrik/View/GrossisteContent.fxml"));
          pane.setPrefWidth(1200);
          pane.setPrefHeight(542);
          rootpane.getChildren().setAll(pane);
    }

    @FXML
    void openMagasinier(ActionEvent event) throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/trackafrik/View/MagasinierContent.fxml"));
         pane.setPrefWidth(1200);
          pane.setPrefHeight(542);
          rootpane.getChildren().setAll(pane);
    }
     private ScreenLoader loader;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   @Override
    public void setScreenParent(ScreenLoader loader) {
        this.loader = loader;
    }
    
}
