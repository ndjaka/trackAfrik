/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.entity.donnees;

import java.util.List;
import javafx.beans.property.StringProperty;

/**
 *
 * @author lenovo
 */
public class Categorie {
    
    private StringProperty idCategorie;
    private StringProperty libCategorie;
    private List<ProduitEnStock> produits;

    public Categorie() {
    }

    public Categorie(StringProperty idCategorie, StringProperty libCategorie) {
        this.idCategorie = idCategorie;
        this.libCategorie = libCategorie;
    }

    public StringProperty getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(StringProperty idCategorie) {
        this.idCategorie = idCategorie;
    }

    public StringProperty getLibCategorie() {
        return libCategorie;
    }

    public void setLibCategorie(StringProperty libCategorie) {
        this.libCategorie = libCategorie;
    }

    public List<ProduitEnStock> getProduits() {
        return produits;
    }

    public void setProduits(List<ProduitEnStock> produits) {
        this.produits = produits;
    }

    @Override
    public String toString() {
        return "Categorie{" + "idCategorie=" + idCategorie + ", libCategorie=" + libCategorie + '}';
    }
    
}
