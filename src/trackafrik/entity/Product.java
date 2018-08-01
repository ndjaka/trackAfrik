/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.entity;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ndjaka
 */
public class Product {
    private StringProperty code;
    private StringProperty designation;
    private StringProperty qte_stock;
    private StringProperty prix_unitaire;
    private StringProperty rayon;
    private StringProperty categorie;
    private StringProperty valeur;
    public Product(String code, String designation, String qte_stock, String prix_unitaire, String rayon, String categorie,String valeur) {
        this.code = new SimpleStringProperty(code);
        this.designation = new SimpleStringProperty(designation);
        this.qte_stock = new SimpleStringProperty(qte_stock);
        this.prix_unitaire =new SimpleStringProperty( prix_unitaire);
        this.rayon = new SimpleStringProperty(rayon);
        this.categorie = new SimpleStringProperty(categorie);
        this.valeur = new SimpleStringProperty(valeur);
    }

    public StringProperty getValeur() {
        return valeur;
    }

    public void setValeur(StringProperty valeur) {
        this.valeur = valeur;
    }

    
    public StringProperty getCode() {
        return code;
    }

    public void setCode(StringProperty code) {
        this.code = code;
    }

    public StringProperty getDesignation() {
        return designation;
    }

    public void setDesignation(StringProperty designation) {
        this.designation = designation;
    }

    public StringProperty getQte_stock() {
        return qte_stock;
    }

    public void setQte_stock(StringProperty qte_stock) {
        this.qte_stock = qte_stock;
    }

    public StringProperty getPrix_unitaire() {
        return prix_unitaire;
    }

    public void setPrix_unitaire(StringProperty prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    public StringProperty getRayon() {
        return rayon;
    }

    public void setRayon(StringProperty rayon) {
        this.rayon = rayon;
    }

    public StringProperty getCategorie() {
        return categorie;
    }

    public void setCategorie(StringProperty categorie) {
        this.categorie = categorie;
    }
    
    
}
