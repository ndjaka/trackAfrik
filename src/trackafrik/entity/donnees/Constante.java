/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.entity.donnees;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class Constante {

    public static float tauxTVA = (float) 0.1925;
    public static List<ProduitFournisseur> produitsimportes = new ArrayList();
    public static List<ProduitClient> produitsexportesclient = new ArrayList();
    public static List<ProduitGrossiste> produitsexportesgrossiste = new ArrayList();
    public static List<ProduitEnStock> produitsenstock = new ArrayList();
    public static List<Client> nosclients = new ArrayList();
    public static List<Fournisseur> nosfournisseurs = new ArrayList();
    public static List<Grossiste> nosgrossistes = new ArrayList();

    public static List<ProduitClient> ChargerListeProduitClient() {

        produitsexportesclient.add(new ProduitClient("prod1", "mais", 20000, 200, "viatamine A", "box1", "NDJAKALO ENTERPRISE"));
        produitsexportesclient.add(new ProduitClient("prod2", "arachide", 30000, 200, "viatamine D", "box2", "PIEDJOU ENTERPRISE"));
        produitsexportesclient.add(new ProduitClient("prod3", "tapioca", 20000, 200, "viatamine A", "box3", "NDJAKALO ENTERPRISE"));
        produitsexportesclient.add(new ProduitClient("prod4", "sucre", 20000, 200, "viatamine A", "box4", "NDJAKALO ENTERPRISE"));
        produitsexportesclient.add(new ProduitClient("prod5", "yaourt", 20000, 200, "viatamine A", "box5", "NDJAKALO ENTERPRISE"));
        produitsexportesclient.add(new ProduitClient("prod6", "sucre", 20000, 200, "viatamine A", "box6", "NDJAKALO ENTERPRISE"));
        produitsexportesclient.add(new ProduitClient("prod7", "style", 20000, 200, null, "box7", "NDJAKALO ENTERPRISE"));
        return produitsexportesclient;
    }

    public static List<ProduitFournisseur> ChargerListeProduitFounisseur() {
        produitsimportes.add(new ProduitFournisseur("prodf1", "mais", 25000, 250, "NDJAKALO ENTERPRISE", "VITAMINE A", "grain", "box1"));
        produitsimportes.add(new ProduitFournisseur("prodf1", "mais", 25000, 250, "NDJAKALO ENTERPRISE", "VITAMINE A", "grain", "box2"));
        produitsimportes.add(new ProduitFournisseur("prodf1", "mais", 25000, 250, "NDJAKALO ENTERPRISE", "VITAMINE A", "grain", "box2"));
        produitsimportes.add(new ProduitFournisseur("prodf1", "mais", 25000, 250, "NDJAKALO ENTERPRISE", "VITAMINE A", "grain", "box2"));
        produitsimportes.add(new ProduitFournisseur("prodf1", "mais", 25000, 250, "NDJAKALO ENTERPRISE", "VITAMINE A", "grain", "box2"));
        produitsimportes.add(new ProduitFournisseur("prodf1", "mais", 25000, 250, "NDJAKALO ENTERPRISE", "VITAMINE A", "grain", "box2"));
        return produitsimportes;

    }

    public static List<ProduitEnStock> ChargerListeProduitEnStocks() {

        produitsenstock.add(new ProduitEnStock("prod1", "mais", 250, "VITAMINE A", "Graine", 250, "BOX1"));
        produitsenstock.add(new ProduitEnStock("prod1", "mais", 250, "VITAMINE A", "Graine", 250, "BOX1"));
        produitsenstock.add(new ProduitEnStock("prod1", "mais", 250, "VITAMINE A", "Graine", 250, "BOX1"));
        produitsenstock.add(new ProduitEnStock("prod1", "mais", 250, "VITAMINE A", "Graine", 250, "BOX1"));
        produitsenstock.add(new ProduitEnStock("prod1", "mais", 250, "VITAMINE A", "Graine", 250, "BOX1"));
        produitsenstock.add(new ProduitEnStock("prod1", "mais", 250, "VITAMINE A", "Graine", 450, "BOX1"));

        return produitsenstock;

    }

}
