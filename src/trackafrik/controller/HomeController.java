/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.controller;

import com.zilabs.multiscreenframework.core.ScreenLoader;
import com.zilabs.multiscreenframework.interfaces.IScreenController;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import trackafrik.entity.Top;

/**
 *
 * @author ndjaka
 */
public class HomeController implements Initializable, IScreenController {
     private ScreenLoader loader;
    @FXML
    private PieChart id_piechart;
    @FXML
    private StackedBarChart<String, Number> id_recent;
    @FXML
    private BarChart<String, Number> id_regions;
    @FXML
    private TableView<Top> table_top_prod;

    @FXML
    private TableColumn<Top, String> top_name;

    @FXML
    private TableColumn<Top, String> top_qte;

    @FXML
    private TableColumn<Top, String> top_prix;
    
    private ObservableList<Top> topList;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
       topList = FXCollections.observableArrayList();
       topList.add(
            new Top("Jacob",     "Smith",    "jacob.smith@example.com" ));
            topList.add(
            new Top("Jacob",     "Smith",    "jacob.smith@example.com" ));
             topList.add(
            new Top("Jacob",     "Smith",    "jacob.smith@example.com" ));
            topList.add(
            new Top("Jacob",     "Smith",    "jacob.smith@example.com" ));
        
        top_name.setCellValueFactory((TableColumn.CellDataFeatures<Top, String> param) -> param.getValue().nomProperty());
        top_qte.setCellValueFactory((TableColumn.CellDataFeatures<Top, String> param) -> param.getValue().qteProperty());
        top_prix.setCellValueFactory((TableColumn.CellDataFeatures<Top, String> param) -> param.getValue().prixProperty());
         table_top_prod.setItems(null);
         table_top_prod.setItems(topList);
      //  table_top_prod.getColumns().addAll(top_name, lastNameCol, emailCol);
        
        
        
        ObservableList<PieChart.Data> pieChartData =
        FXCollections.observableArrayList(
        new PieChart.Data("Sardines Broli", 25),
        new PieChart.Data("Savon Azur ", 15),
        new PieChart.Data("Cube Magie", 15),
        new PieChart.Data("Sucre Sosucam", 45));
               id_piechart.setData(pieChartData);
               id_piechart.setTitle("PRODUITS LES PLUS VENDUS");
                       

               
      CategoryAxis xAxis = new CategoryAxis();
      xAxis.setCategories(FXCollections.<String>observableArrayList(Arrays.asList("Africa", "America", "Asia", "Europe", "Oceania")));
      xAxis.setLabel("category");
    NumberAxis yAxis = new NumberAxis();
    yAxis.setLabel("Population (In millions)");
    id_regions.setTitle("Historique du Bénefice des Trois dernier années  Par Region");
//Prepare XYChart.Series objects by setting data
XYChart.Series<String, Number> series1 = new XYChart.Series<>();
series1.setName("2016");
series1.getData().add(new XYChart.Data<>("Lagos", 107));
series1.getData().add(new XYChart.Data<>("Paris", 31));
series1.getData().add(new XYChart.Data<>("Douala", 635));
series1.getData().add(new XYChart.Data<>("Accra", 2003));
series1.getData().add(new XYChart.Data<>("Lisbone", 2));
XYChart.Series<String, Number> series2 = new XYChart.Series<>();
series2.setName("2017");
series2.getData().add(new XYChart.Data<>("Lagos", 133));
series2.getData().add(new XYChart.Data<>("Paris", 156));
series2.getData().add(new XYChart.Data<>("Douala", 1047));
series2.getData().add(new XYChart.Data<>("Accra", 408));
series1.getData().add(new XYChart.Data<>("Lisbone", 883));
XYChart.Series<String, Number> series3 = new XYChart.Series<>();
series3.setName("2018");
series3.getData().add(new XYChart.Data<>("Lagos", 973));
series3.getData().add(new XYChart.Data<>("Paris", 914));
series3.getData().add(new XYChart.Data<>("Douala", 4054));
series3.getData().add(new XYChart.Data<>("Accra", 732));
series1.getData().add(new XYChart.Data<>("Lisbone", 34));
//Setting the data to bar chart
id_regions.getData().addAll(series1, series2, series3);
       
    }    

   @Override
    public void setScreenParent(ScreenLoader loader) {
        this.loader = loader;
    }
}
