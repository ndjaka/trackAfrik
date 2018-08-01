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
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import trackafrik.entity.donnees.CalculStock;
import trackafrik.entity.donnees.Constante;
import trackafrik.entity.donnees.ProduitClient;
import trackafrik.entity.donnees.ProduitEnStock;
import trackafrik.entity.donnees.ProduitFournisseur;

/**
 * FXML Controller class
 *
 * @author ndjaka
 */
public class ImportContentController implements Initializable, IScreenController {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TableView<ProduitFournisseur> table_import;

    @FXML
    private TableColumn<ProduitFournisseur, String> colummcode;

    @FXML
    private TableColumn<ProduitFournisseur, String> colummdesignation;

    @FXML
    private TableColumn<ProduitFournisseur, String> colummqte;

    @FXML
    private TableColumn<ProduitFournisseur, String> colummprix;

    @FXML
    private TableColumn<ProduitFournisseur, String> colummcategorie;

    @FXML
    private TableColumn<ProduitFournisseur, String> colummvaleur;

    @FXML
    private TableColumn<ProduitFournisseur, String> columnfournisseur;
    @FXML
    private TableColumn<ProduitFournisseur, String> colummrayon;
    @FXML
    private JFXTextField code;

    @FXML
    private JFXTextField designation;

    @FXML
    private JFXTextField qte_import;

    @FXML
    private JFXTextField prix_unit;

    @FXML
    private JFXTextField cat;

    @FXML
    private JFXTextField valeur;
    
   @FXML
    private JFXComboBox<String> rayon;

    @FXML
    private JFXComboBox<String> fournisseur;
 private ObservableList<ProduitFournisseur> data;
   private ScreenLoader loader;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fournisseur.getItems().add("KOMBOU ENTERPRISE");
        fournisseur.getItems().add("KOMBOU ENTERPRISE");
        fournisseur.getItems().add("KOMBOU ENTERPRISE");
        fournisseur.getItems().add("KOMBOU ENTERPRISE");
        fournisseur.getItems().add("KOMBOU ENTERPRISE");
        
        rayon.getItems().add("BOX 1");
        rayon.getItems().add("BOX 2");
        rayon.getItems().add("BOX 3");
                data = FXCollections.observableArrayList();
        
        
        Constante.ChargerListeProduitFounisseur().stream().forEach((founisseurs) -> {
            data.add(founisseurs);
        });

        colummcode.setCellValueFactory((TableColumn.CellDataFeatures<ProduitFournisseur, String> param) -> param.getValue().getCodeProd());

        colummdesignation.setCellValueFactory((TableColumn.CellDataFeatures<ProduitFournisseur, String> param) -> param.getValue().getLibProd());

        colummqte.setCellValueFactory((TableColumn.CellDataFeatures<ProduitFournisseur, String> param) -> param.getValue().getQteImporte().asString());

        colummprix.setCellValueFactory((TableColumn.CellDataFeatures<ProduitFournisseur, String> param) -> param.getValue().getPrixU().asString());

        

        columnfournisseur.setCellValueFactory((TableColumn.CellDataFeatures<ProduitFournisseur, String> param) -> param.getValue().getNomFournisseur());
        colummcategorie.setCellValueFactory((TableColumn.CellDataFeatures<ProduitFournisseur, String> param) -> param.getValue().getNomCategorie());
        colummvaleur.setCellValueFactory((TableColumn.CellDataFeatures<ProduitFournisseur, String> param) -> param.getValue().getValeur());
        colummrayon.setCellValueFactory((TableColumn.CellDataFeatures<ProduitFournisseur, String> param) -> param.getValue().getRayon());
        
        table_import.setItems(null); 
        table_import.setItems(data);
    }    

   @Override
    public void setScreenParent(ScreenLoader loader) {
        this.loader = loader;
    }
      @FXML
    void enregistrer(ActionEvent event) {
          String codes = code.getText();

          String designate = designation.getText();

          int qte_imp = Integer.valueOf(qte_import.getText());

          float prixUnit = Float.valueOf(prix_unit.getText());
          String ctg = cat.getText();

          String value = valeur.getText();

          String fourniseur = fournisseur.getSelectionModel().getSelectedItem();
          String ray = rayon.getSelectionModel().getSelectedItem();
      
     Constante.ChargerListeProduitFounisseur().add(  new ProduitFournisseur(codes, designate, qte_imp, prixUnit, fourniseur, value, fourniseur,ray));
    
     
   
     table_import.getItems().add(new ProduitFournisseur(codes, designate, qte_imp, prixUnit, fourniseur, value, fourniseur,ray));
          
                  
    }
      
}
