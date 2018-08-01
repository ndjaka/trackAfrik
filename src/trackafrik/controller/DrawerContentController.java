/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.controller;

import com.zilabs.multiscreenframework.core.ScreenLoader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author ndjaka
 */
public class DrawerContentController implements Initializable{

    /**
     * Initializes the controller class.
     */
    private ScreenLoader loader;
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }     
}
