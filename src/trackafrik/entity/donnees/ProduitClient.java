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
public class ProduitClient extends Produit{
    
    private StringProperty codeProd;
    private StringProperty libProd;
    private IntegerProperty qteExporte;
    private FloatProperty prixU;
    private StringProperty valeur;
    private StringProperty rayon;
    private StringProperty nomclient;
    private StringProperty idCategorie;
    

    public ProduitClient() {
    }

    public ProduitClient(String codeProd, String libProd, int qteExporte,float prixU, String valeur, String rayon,String nom) {
        this.codeProd = new SimpleStringProperty(codeProd);
        this.libProd = new SimpleStringProperty(libProd);
        this.qteExporte = new SimpleIntegerProperty(qteExporte);
        this.prixU = new SimpleFloatProperty(prixU);
        this.valeur = new SimpleStringProperty(valeur);
        this.nomclient = new SimpleStringProperty(nom);
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

    public IntegerProperty getQteExporte() {
        return qteExporte;
    }

    public void setQteExporte(IntegerProperty qteExporte) {
        this.qteExporte = qteExporte;
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

    public StringProperty getRayon() {
        return rayon;
    }

    public void setRayon(StringProperty rayon) {
        this.rayon = rayon;
    }

    public StringProperty getNomClient() {
        return nomclient;
    }

    public void setNomClient(StringProperty idClient) {
        this.nomclient = idClient;
    }

    @Override
    public String toString() {
        return "ProduitClient{" + "codeProd=" + codeProd + ", libProd=" + libProd + ", qteExporte=" + qteExporte + ", prixU=" + prixU + ", valeur=" + valeur + ", rayon=" + rayon + ", idClient=" + nomclient + ", idCategorie=" + idCategorie + '}';
    }
    
}
