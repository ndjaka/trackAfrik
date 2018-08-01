/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.entity.donnees;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author lenovo
 */
public class ProduitEnStock extends Produit {

    private StringProperty codeProd;
    private StringProperty libProd;
    private FloatProperty prixU;
    private StringProperty valeur;
    private StringProperty rayon;
    private StringProperty idCategorie;
    private IntegerProperty qteStock;
   
    private int seuilAlerte;

    public ProduitEnStock() {
    }

    public ProduitEnStock(String codeProd, String libProd, float prixU, String valeur, String idCategorie, Integer qteStock,String rayon) {
        this.codeProd = new SimpleStringProperty(codeProd);
        this.libProd = new SimpleStringProperty(libProd);
        this.prixU = new SimpleFloatProperty(prixU);
        this.valeur = new SimpleStringProperty(valeur);
        this.idCategorie = new SimpleStringProperty(idCategorie);
        this.qteStock = new SimpleIntegerProperty(qteStock);
        this.rayon = new SimpleStringProperty(rayon);
    }

    public StringProperty getCodeProd() {
        return codeProd;
    }

    public void setCodeProd(StringProperty codeProd) {
        this.codeProd = codeProd;
    }

    public StringProperty getLibProd() {
        return libProd;
    }

    public void setLibProd(StringProperty libProd) {
        this.libProd = libProd;
    }

    public FloatProperty getPrixU() {
        return prixU;
    }

    public void setPrixU(FloatProperty prixU) {
        this.prixU = prixU;
    }

    public StringProperty getValeur() {
        return valeur;
    }

    public void setValeur(StringProperty valeur) {
        this.valeur = valeur;
    }

    public StringProperty getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(StringProperty idCategorie) {
        this.idCategorie = idCategorie;
    }

    public int getSeuilAlerte() {
        return seuilAlerte;
    }

   
    public void setSeuilAlerte(int seuilAlerte) {
        this.seuilAlerte = seuilAlerte;
    }

    public StringProperty getRayon() {
        return rayon;
    }

    public void setRayon(StringProperty rayon) {
        this.rayon = rayon;
    }

    public IntegerProperty getQteStock() {
        return qteStock;
    }

    public void setQteStock(IntegerProperty qteStock) {
        this.qteStock = qteStock;
    }
    
    

    @Override
    public String toString() {
        return "ProduitEnStock{" + "codeProd=" + codeProd + ", libProd=" + libProd + ", prixU=" + prixU + ", valeur=" + valeur + ", idCategorie=" + idCategorie + ", seuilAlerte=" + seuilAlerte + '}';
    }

  

}
