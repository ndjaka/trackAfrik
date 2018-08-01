/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.controller;

import com.jfoenix.controls.JFXTextField;
import com.zilabs.multiscreenframework.core.ScreenLoader;
import com.zilabs.multiscreenframework.interfaces.IScreenController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import trackafrik.entity.donnees.Client;

/**
 * FXML Controller class
 *
 * @author ndjaka
 */
public class ClientContentController implements Initializable, IScreenController {

    /**
     * Initializes the controller class.
     */
    
    private ScreenLoader loader;
     @FXML
    private TableView<Client> table_client;
    @FXML
             private TableColumn<Client, String>    columnNom;
    @FXML
    private TableColumn<Client, String> columntelephone;

    @FXML
    private TableColumn<Client, String> columnpays;

    @FXML
    private TableColumn<Client, String> columnregion;

    @FXML
    private TableColumn<Client, String> columnemail;

    @FXML
    private JFXTextField nom;

    @FXML
    private JFXTextField telephone;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXTextField pays;

    @FXML
    private JFXTextField region;

    @FXML
    private JFXTextField ville;

    @FXML
    private JFXTextField localite;
    private ObservableList<Client> data ;

    @FXML
    void enregistrer(ActionEvent event) {
        Client c = new Client();
        c.setNom(new SimpleStringProperty(nom.getText()));
        c.setMail(new SimpleStringProperty(email.getText()));
        c.setPays(new SimpleStringProperty(pays.getText()));
        c.setRegion(new SimpleStringProperty(region.getText()));
        c.setTelephone(new SimpleStringProperty(telephone.getText()));
        table_client.getItems().add(c);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        data = FXCollections.observableArrayList();
        Client c = new Client();
        c.setNom(new SimpleStringProperty("nom"));
        c.setMail(new SimpleStringProperty("eugenendjaka@gmail.com"));
        c.setPays(new SimpleStringProperty("cameroun"));
        c.setRegion(new SimpleStringProperty("centre"));
        c.setTelephone(new SimpleStringProperty("678127584"));
        
        data.add(c);
        
        
        
        columnNom.setCellValueFactory((TableColumn.CellDataFeatures<Client, String> param) -> param.getValue().getNom());
        columnemail.setCellValueFactory((TableColumn.CellDataFeatures<Client, String> param) -> param.getValue().getMail());
        columnpays.setCellValueFactory((TableColumn.CellDataFeatures<Client, String> param) -> param.getValue().getPays());
        columnregion.setCellValueFactory((TableColumn.CellDataFeatures<Client, String> param) -> param.getValue().getRegion());
        columntelephone.setCellValueFactory((TableColumn.CellDataFeatures<Client, String> param) -> param.getValue().getTelephone());
        
        table_client.setItems(null);
        table_client.setItems(data);

    }    

   @Override
    public void setScreenParent(ScreenLoader loader) {
        this.loader = loader;
    }

   
    
}
