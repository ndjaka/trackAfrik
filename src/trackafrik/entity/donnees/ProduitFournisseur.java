/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.entity.donnees;

import java.util.Objects;
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
public class ProduitFournisseur extends Produit{
    
    private StringProperty codeProd;
    private StringProperty libProd;
    private IntegerProperty qteImporte;
    private FloatProperty prixU;
    private StringProperty nomFournisseur;
    private StringProperty valeur;
    private StringProperty nomCategorie;
    private StringProperty rayon;
    public ProduitFournisseur() {
    }

    public ProduitFournisseur(String codeProd, String libProd, int qteImporte, float prixU, String idFournisseur, String valeur, String idCategorie,String rayon) {
        this.codeProd = new SimpleStringProperty(codeProd);
        this.libProd = new SimpleStringProperty(libProd);
        this.qteImporte = new SimpleIntegerProperty(qteImporte);
        this.prixU = new SimpleFloatProperty(prixU);
        this.nomFournisseur = new SimpleStringProperty(idFournisseur);
        this.valeur = new SimpleStringProperty(valeur);
        this.nomCategorie = new SimpleStringProperty(idCategorie);
        this.rayon = new SimpleStringProperty(rayon);
    }

    public StringProperty getRayon() {
        return rayon;
    }

    public void setRayon(StringProperty rayon) {
        this.rayon = rayon;
    }

    public StringProperty getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(StringProperty nomCategorie) {
        this.nomCategorie = nomCategorie;
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

    public IntegerProperty  getQteImporte() {
        return qteImporte;
    }

    public void setQteImporte(IntegerProperty  qteImporte) {
        this.qteImporte = qteImporte;
    }

    public FloatProperty  getPrixU() {
        return prixU;
    }

    public void setPrixU(FloatProperty  prixU) {
        this.prixU = prixU;
    }

    public StringProperty getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(StringProperty nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public StringProperty getValeur() {
        return valeur;
    }

    public void setValeur(StringProperty valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return "ProduitFournisseur{" + "codeProd=" + codeProd + ", libProd=" + libProd + ", qteImporte=" + qteImporte + ", prixU=" + prixU + ", idFournisseur=" + nomFournisseur + ", valeur=" + valeur + ", idCategorie=" + nomCategorie + '}';
    }
    
} 
