/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.entity.donnees;

import java.util.List;
import java.util.Objects;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author lenovo
 */
public class Client {
    
   
    private StringProperty nom;
    private StringProperty telephone;
    private StringProperty mail;
    private StringProperty localite;
    private StringProperty ville;
    private StringProperty region;
    private StringProperty pays;
    private List<ProduitClient> mesproduits;

    public Client() {
    }

    public Client( String nom, String telephone, String mail, String localite, String ville, String region, String pays) {
        
        
        this.nom = new SimpleStringProperty(nom);
        this.telephone = new SimpleStringProperty(telephone);
        this.mail = new SimpleStringProperty(mail);
        this.localite = new SimpleStringProperty(localite);
        this.ville = new SimpleStringProperty(ville);
        this.region = new SimpleStringProperty(region);
        this.pays = new SimpleStringProperty(pays);
    }


    public StringProperty getNom() {
        return nom;
    }

    public void setNom(StringProperty nom) {
        this.nom = nom;
    }

    public StringProperty getTelephone() {
        return telephone;
    }

    public void setTelephone(StringProperty telephone) {
        this.telephone = telephone;
    }

    public StringProperty getMail() {
        return mail;
    }

    public void setMail(StringProperty mail) {
        this.mail = mail;
    }

    public StringProperty getLocalite() {
        return localite;
    }

    public void setLocalite(StringProperty localite) {
        this.localite = localite;
    }

    public StringProperty getVille() {
        return ville;
    }

    public void setVille(StringProperty ville) {
        this.ville = ville;
    }

    public StringProperty getRegion() {
        return region;
    }

    public void setRegion(StringProperty region) {
        this.region = region;
    }

    public StringProperty getPays() {
        return pays;
    }

    public void setPays(StringProperty pays) {
        this.pays = pays;
    }

    public List<ProduitClient> getMesproduits() {
        return mesproduits;
    }

    public void setMesproduits(List<ProduitClient> mesproduits) {
        this.mesproduits = mesproduits;
    }

}
