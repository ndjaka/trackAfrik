/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTreeTableView;
import com.zilabs.multiscreenframework.core.ScreenLoader;
import com.zilabs.multiscreenframework.interfaces.IScreenController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;
import javafx.util.StringConverter;
import trackafrik.entity.Product;
import trackafrik.entity.donnees.Constante;
import trackafrik.entity.donnees.ProduitEnStock;

/**
 * FXML Controller class
 *
 * @author ndjaka
 */
public class ProduitContentController  implements Initializable, IScreenController {


    @FXML
    private JFXButton imprimer;
      private ScreenLoader loader;
    @FXML
    private TableView<ProduitEnStock> treeview;
    @FXML
    private TableColumn<ProduitEnStock, String> code;
    @FXML
    private TableColumn<ProduitEnStock, String> designation;
    @FXML
    private TableColumn<ProduitEnStock, String> qte_stock;
    @FXML
    private TableColumn<ProduitEnStock, String> prix_unit;
    @FXML
    private TableColumn<ProduitEnStock, String> rayon;
    @FXML
    private TableColumn<ProduitEnStock, String> categorie;
    @FXML
    private TableColumn<ProduitEnStock, String> columnvaleur;
    private ObservableList<ProduitEnStock> data ;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          data = FXCollections.observableArrayList();
           
          Constante.ChargerListeProduitEnStocks().stream().forEach((enStock) -> {
              data.add(enStock);
        });
       
        
          
         
        
        code.setCellValueFactory((TableColumn.CellDataFeatures<ProduitEnStock, String> param) -> param.getValue().getCodeProd());
        
       designation.setCellValueFactory((TableColumn.CellDataFeatures<ProduitEnStock, String> param) -> param.getValue().getLibProd());
        qte_stock.setCellValueFactory((TableColumn.CellDataFeatures<ProduitEnStock, String> param) -> param.getValue().getQteStock().asString());
        prix_unit.setCellValueFactory((TableColumn.CellDataFeatures<ProduitEnStock, String> param) -> param.getValue().getPrixU().asString());
        rayon.setCellValueFactory((TableColumn.CellDataFeatures<ProduitEnStock, String> param) -> param.getValue().getRayon());
        categorie.setCellValueFactory((TableColumn.CellDataFeatures<ProduitEnStock, String> param) -> param.getValue().getIdCategorie());
        columnvaleur.setCellValueFactory((TableColumn.CellDataFeatures<ProduitEnStock, String> param) -> param.getValue().getValeur());
        
        treeview.setItems(null); 
        treeview.setItems(data);
    
          
    }    

    
    @FXML
    void supprimer(ActionEvent event) {
             ProduitEnStock selecteditem = treeview.getSelectionModel().getSelectedItem();
             treeview.getItems().remove(selecteditem);
    }

   @Override
    public void setScreenParent(ScreenLoader loader) {
        this.loader = loader;
    }
}
