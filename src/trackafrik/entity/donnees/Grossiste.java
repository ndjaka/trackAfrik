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
public class Grossiste {
    
    private StringProperty login;
    private StringProperty password;
    private StringProperty nomCommercial;
    private StringProperty telephone;
    private StringProperty mail;
    private StringProperty localite;
    private StringProperty ville;
    private StringProperty region;
    private StringProperty pays;
    private List<ProduitGrossiste> mesproduits; 

    public Grossiste() {
    }

    public Grossiste(String login, String password, String nomCommercial, String telephone, String mail, String localite, String ville, String region, String pays) {
        
        this.login = new SimpleStringProperty(login);
        this.password = new SimpleStringProperty(password);
        this.nomCommercial = new SimpleStringProperty(nomCommercial);
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

    public StringProperty getNomCommercial() {
        return nomCommercial;
    }

    public void setNomCommercial(StringProperty nomCommercial) {
        this.nomCommercial = nomCommercial;
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

    public List<ProduitGrossiste> getMesproduits() {
        return mesproduits;
    }

    public void setMesproduits(List<ProduitGrossiste> mesproduits) {
        this.mesproduits = mesproduits;
    }

    @Override
    public String toString() {
        return "Grossiste{" + "login=" + login + ", password=" + password + ", nomCommercial=" + nomCommercial + ", telephone=" + telephone + ", mail=" + mail + ", localite=" + localite + ", ville=" + ville + ", region=" + region + ", pays=" + pays + '}';
    }

}
