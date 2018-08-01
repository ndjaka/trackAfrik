/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.entity.donnees;

import trackafrik.entity.interfaces.ICalculPrix;



/**
 *
 * @author lenovo
 */
public class Produit implements ICalculPrix{
    
    public float CalculPrixTVA(int qte, float prixU){

        return qte * prixU * Constante.tauxTVA;
    }

    @Override
    public float CalculPrixHT(int qte, float prixU) {
       
        return qte * prixU;
    }

    @Override
    public float CalculPrixTOTAL(int qte, float prixU) {
        
        return (qte * prixU) * (1 + Constante.tauxTVA);
    }
    
}
