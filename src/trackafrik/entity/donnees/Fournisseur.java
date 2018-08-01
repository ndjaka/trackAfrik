/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.entity.donnees;

import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author lenovo
 */
public class Fournisseur {
    
    private StringProperty login;
    private StringProperty password;
    private StringProperty nom;
    private StringProperty telephone;
    private StringProperty mail;
    private StringProperty localite;
    private StringProperty ville;
    private StringProperty region;
    private StringProperty pays;
    private List<ProduitFournisseur> mesproduits; 

    public Fournisseur() {
    }

    public Fournisseur(String login, String password, String nom, String telephone, String mail, String localite, String ville, String region, String pays) {
        
        this.login = new SimpleStringProperty(login);
        this.password = new SimpleStringProperty(password);
        this.nom = new SimpleStringProperty(nom);
        this.telephone = new SimpleStringProperty(telephone);
        this.mail = new SimpleStringProperty(mail);
        this.localite = new SimpleStringProperty(localite);
        this.ville = new SimpleStringProperty(ville);
        this.region = new SimpleStringProperty(region);
        this.pays = new SimpleStringProperty(pays);
    }

    public StringProperty getLogin() {
        return login;
    }

    public void setLogin(StringProperty login) {
        this.login = login;
    }

    public StringProperty getPassword() {
        return password;
    }

    public void setPassword(StringProperty password) {
        this.password = password;
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

    public List<ProduitFournisseur> getMesproduits() {
        return mesproduits;
    }

    public void setMesproduits(List<ProduitFournisseur> mesproduits) {
        this.mesproduits = mesproduits;
    }

    @Override
    public String toString() {
        return "Fournisseur{" + "login=" + login + ", password=" + password + ", nom=" + nom + ", telephone=" + telephone + ", mail=" + mail + ", localite=" + localite + ", ville=" + ville + ", region=" + region + ", pays=" + pays + '}';
    }
    
}
