/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.entity.interfaces;

/**
 *
 * @author lenovo
 */
public interface ICalculPrix {
    
    float CalculPrixHT(int qte, float prixU);
    float CalculPrixTOTAL(int qte, float prixU);
}
