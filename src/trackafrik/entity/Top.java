/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.entity;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author InfinixX99
 */
public class Top {
    
    private StringProperty nom;
    private StringProperty qte;
    private StringProperty prix;
 
    public Top(String fName, String lName, String email) {
        this.nom = new SimpleStringProperty(fName);
        this.qte = new SimpleStringProperty(lName);
        this.prix = new SimpleStringProperty(email);
    }

    public void setNom(StringProperty nom) {
        this.nom = nom;
    }

    public void setQte(StringProperty qte) {
        this.qte = qte;
    }

    public void setPrix(StringProperty prix) {
        this.prix = prix;
    }
 
    public StringProperty nomProperty() {
        return nom;
    }
 
    public StringProperty qteProperty() {
        return qte;
    }
 
    public StringProperty prixProperty() {
        return prix;
    }
}
