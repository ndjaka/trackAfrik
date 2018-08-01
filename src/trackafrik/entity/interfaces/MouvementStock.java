/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.entity.interfaces;

import trackafrik.entity.donnees.ProduitClient;
import trackafrik.entity.donnees.ProduitFournisseur;
import trackafrik.entity.donnees.ProduitGrossiste;



/**
 *
 * @author lenovo
 */
public interface MouvementStock {
    
    void ajouterStock(ProduitFournisseur pf);
    void reduireStockClient(ProduitClient pc);
    void reduireStockGrossiste(ProduitGrossiste pg);

}
