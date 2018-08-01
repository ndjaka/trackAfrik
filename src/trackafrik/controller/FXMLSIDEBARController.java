/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.controller;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import com.zilabs.multiscreenframework.animations.AnimationSettings;
import com.zilabs.multiscreenframework.core.ScreenLoader;
import com.zilabs.multiscreenframework.interfaces.IScreenController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import trackafrik.screens.Screens;

/**
 *
 * @author ndjaka
 */
public class FXMLSIDEBARController implements Initializable {
     public static ScreenLoader loader = new ScreenLoader();
     Screens screen = Screens.getInstance();

    @FXML
    private JFXHamburger hamburger;
    @FXML
    private JFXDrawer drawer;
    @FXML
    private AnchorPane WrapperAnchorpane;
    @FXML
    private Button id_dashboard;

    @FXML
    private Button id_profils;

    @FXML
    private Button id_produits;

    @FXML
    private Button id_export;

    @FXML
    private Button id_import;

    @FXML
    private Button id_deconnexion;

    @FXML
    private AnchorPane anchorpane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
        try {    // Load screens
           
            VBox box = FXMLLoader.load(getClass().getResource("/trackafrik/View/DrawerContent.fxml"));
            drawer.setSidePane(box);
            
            loader.allowAnimation(AnimationSettings.ANIMATION_ON);
            loader.setAnimationType(AnimationSettings.ANIMATION_FADE);
            loader.setAnimationDuration(1);
            loader.loadScreen(screen.SCREEN_0_NAME, screen.PACKAGE_VIEW + screen.SCREEN_0_FXML);
            loader.loadScreen(screen.SCREEN_1_NAME, screen.PACKAGE_VIEW + screen.SCREEN_1_FXML);
            loader.loadScreen(screen.SCREEN_2_NAME, screen.PACKAGE_VIEW + screen.SCREEN_2_FXML);
            loader.loadScreen(screen.SCREEN_3_NAME, screen.PACKAGE_VIEW + screen.SCREEN_3_FXML);
            loader.loadScreen(screen.SCREEN_4_NAME, screen.PACKAGE_VIEW + screen.SCREEN_4_FXML);
                       
            loader.setWrapperAnchorPane(WrapperAnchorpane);
             loader.setScreen(screen.SCREEN_4_NAME);
            for(Node node : box.getChildren()){
                if(node.getAccessibleText()!=null){
                    node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
                        switch(node.getAccessibleText()){
                            
                            case "Dashbord":
                                loader.setScreen(screen.SCREEN_4_NAME);
                                break;
                            case "profils" :
                                loader.setScreen(screen.SCREEN_0_NAME);
                                break;
                              case "import" :
                                loader.setScreen(screen.SCREEN_1_NAME);
                                break;
                                case "produits" :
                                loader.setScreen(screen.SCREEN_2_NAME);
                                break;
                                case "export":
                               loader.setScreen(screen.SCREEN_3_NAME);
                                break; 
                               case "deconnexion":
                                   System.exit(0);
                        }
                    });
                }
            }
            drawer.open();
            hamburger.setVisible(false);
//            HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamburger);
//            transition.setRate(-1);
//            hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (MouseEvent e) -> {
//                transition.setRate(transition.getRate() * -1);
//                transition.play();
//                if (drawer.isShown()) {
//                    drawer.close();
//                } else {
//                    drawer.open();
//                }
//
//            });
            
            // Configure loader
            
            //loader.loadScreen(screen.SCREEN_2_NAME, screen.PACKAGE_VIEW + screen.SCREEN_2_FXML);
            //loader.loadScreen(screen.SCREEN_3_NAME, screen.PACKAGE_VIEW + screen.SCREEN_3_FXML);
            //loader.loadScreen(screen.SCREEN_4_NAME, screen.PACKAGE_VIEW + screen.SCREEN_4_FXML);

            // Load the initial (first) screen
            //loader.setScreen(screen.SCREEN_0_NAME);
            
            /*id_dashboard.setOnAction((ActionEvent event) -> {
                loader.setScreen(screen.SCREEN_0_NAME);
            });
            id_profils.setOnAction((ActionEvent event) -> {
                loader.setScreen(screen.SCREEN_1_NAME);
            });
             /*id_produits.setOnAction((ActionEvent event) -> {
                loader.setScreen(screen.SCREEN_2_NAME);
            });

              id_export.setOnAction((ActionEvent event) -> {
                loader.setScreen(screen.SCREEN_3_NAME);
            });
               id_import.setOnAction((ActionEvent event) -> {
                loader.setScreen(screen.SCREEN_4_NAME);
            });*/

        } catch (IOException ex) {
            Logger.getLogger(FXMLSIDEBARController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
