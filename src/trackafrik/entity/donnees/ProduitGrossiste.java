/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.entity.donnees;

import java.util.Objects;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author lenovo
 */
public class ProduitGrossiste extends Produit{
    
    private StringProperty codeProd;
    private StringProperty libProd;
    private int qteExporte;
    private float prixU;
    private StringProperty valeur;
    private StringProperty rayon;
    private StringProperty idGrossiste;
    private StringProperty idCategorie;

    public ProduitGrossiste() {
    }

    public ProduitGrossiste(String codeProd, String libProd, int qteExporte, float prixU, String valeur, String rayon, String idGrossiste, String idCategorie) {
        
        this.codeProd = new SimpleStringProperty(codeProd);
        this.libProd = new SimpleStringProperty(libProd);
        this.qteExporte = qteExporte;
        this.prixU = prixU;
        this.valeur = new SimpleStringProperty(valeur);
        this.rayon = new SimpleStringProperty(rayon);
        this.idGrossiste = new SimpleStringProperty(idGrossiste);
        this.idCategorie = new SimpleStringProperty(idCategorie);
    }

    public StringProperty getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(StringProperty idCategorie) {
        this.idCategorie = idCategorie;
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

    public int getQteExporte() {
        return qteExporte;
    }

    public void setQteExporte(int qteExporte) {
        this.qteExporte = qteExporte;
    }

    public float getPrixU() {
        return prixU;
    }

    public void setPrixU(float prixU) {
        this.prixU = prixU;
    }

    public StringProperty getValeur() {
        return valeur;
    }

    public void setValeur(StringProperty valeur) {
        this.valeur = valeur;
    }

    public StringProperty getRayon() {
        return rayon;
    }

    public void setRayon(StringProperty rayon) {
        this.rayon = rayon;
    }

    public StringProperty getIdGrossiste() {
        return idGrossiste;
    }

    public void setIdGrossiste(StringProperty idGrossiste) {
        this.idGrossiste = idGrossiste;
    }

    @Override
    public String toString() {
        return "ProduitGrossiste{" + "codeProd=" + codeProd + ", libProd=" + libProd + ", qteExporte=" + qteExporte + ", prixU=" + prixU + ", valeur=" + valeur + ", rayon=" + rayon + ", idGrossiste=" + idGrossiste + ", idCategorie=" + idCategorie + '}';
    }

    
    
}
