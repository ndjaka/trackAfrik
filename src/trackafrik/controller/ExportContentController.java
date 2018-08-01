/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.zilabs.multiscreenframework.core.ScreenLoader;
import com.zilabs.multiscreenframework.interfaces.IScreenController;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import trackafrik.entity.Product;
import trackafrik.entity.donnees.Constante;
import static trackafrik.entity.donnees.Constante.produitsexportesclient;
import trackafrik.entity.donnees.ProduitClient;
import trackafrik.entity.donnees.ProduitEnStock;

/**
 *
 * @author ndjaka
 */
public class ExportContentController implements Initializable, IScreenController {

    private ScreenLoader loader;
    @FXML
    private TableView<ProduitClient> table_export;

    @FXML
    private TableColumn<ProduitClient, String> code;

    @FXML
    private TableColumn<ProduitClient, String> designation;

    @FXML
    private TableColumn<ProduitClient, String> qte_exporte;

    @FXML
    private TableColumn<ProduitClient, String> prix_unitaire;

    @FXML
    private TableColumn<ProduitClient, String> rayon;

    @FXML
    private TableColumn<ProduitClient, String> client;
    @FXML
    private TableColumn<ProduitClient, String> id_valeur;

    @FXML
    private JFXTextField valeur;

    @FXML
    private JFXTextField code_prod;

    @FXML
    private JFXTextField designation_prod;

    @FXML
    private JFXTextField qte_prod;

    @FXML
    private JFXTextField prix_unit;

    @FXML
    private JFXTextField rayon_prod;

    @FXML
    private JFXComboBox<String> client_prod;
    private ObservableList<ProduitClient> data;

    @FXML
    void enregistrer(ActionEvent event) {
        String cod = code_prod.getText();
        String design = designation_prod.getText();
        int qte = Integer.valueOf(qte_prod.getText());
        float prix_u = Float.valueOf(prix_unit.getText());
        String ray = rayon_prod.getText();
        String clt = client_prod.getSelectionModel().getSelectedItem();
        String val = valeur.getText();
         Constante.ChargerListeProduitClient().add(new ProduitClient(cod, design, qte, prix_u, val, ray, clt));
         table_export.getItems().add(new ProduitClient(cod, design, qte, prix_u, val, ray, clt));

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        client_prod.getItems().add("ICT4D ENTERPRISE");
        client_prod.getItems().add("ESSAM ENTERPRISE");
        client_prod.getItems().add("NDJKAKALO ENTERPRISE");

        data = FXCollections.observableArrayList();
        
        
        Constante.ChargerListeProduitClient().stream().forEach((clients) -> {
            data.add(clients);
        });

        code.setCellValueFactory((TableColumn.CellDataFeatures<ProduitClient, String> param) -> param.getValue().getCodeProd());

        designation.setCellValueFactory((TableColumn.CellDataFeatures<ProduitClient, String> param) -> param.getValue().getLibProd());

        qte_exporte.setCellValueFactory((TableColumn.CellDataFeatures<ProduitClient, String> param) -> param.getValue().getQteExporte().asString());

        prix_unitaire.setCellValueFactory((TableColumn.CellDataFeatures<ProduitClient, String> param) -> param.getValue().getPrixU().asString());

        rayon.setCellValueFactory((TableColumn.CellDataFeatures<ProduitClient, String> param) -> param.getValue().getRayon());

        client.setCellValueFactory((TableColumn.CellDataFeatures<ProduitClient, String> param) -> param.getValue().getNomClient());

        id_valeur.setCellValueFactory((TableColumn.CellDataFeatures<ProduitClient, String> param) -> param.getValue().getValeur());
        
        table_export.setItems(null); 
        table_export.setItems(data);

    }

    @Override
    public void setScreenParent(ScreenLoader loader) {
        this.loader = loader;
    }

}
