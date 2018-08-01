/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.entity.donnees;



import java.util.List;
import trackafrik.entity.interfaces.MouvementStock;

/**
 *
 * @author lenovo
 */
public class CalculStock implements MouvementStock{
    
    private int stockCourant = 0;

    public int getStockCourant() {
        return stockCourant;
    }

    @Override
    public void ajouterStock(ProduitFournisseur pf) {
                stockCourant = stockCourant + pf.getQteImporte().getValue();

    }

    @Override
    public void reduireStockClient(ProduitClient pc) {
                stockCourant = stockCourant - pc.getQteExporte().getValue();

    }

    @Override
    public void reduireStockGrossiste(ProduitGrossiste pg) {
        
                stockCourant = stockCourant - pg.getQteExporte();

    }
}
