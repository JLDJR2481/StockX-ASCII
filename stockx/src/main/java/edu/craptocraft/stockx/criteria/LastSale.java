package edu.craptocraft.stockx.criteria;

import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class LastSale implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        Criteria sales = new Sales();

        List<Offer> saleList = sales.checkCriteria(sneaker);

        return saleList.isEmpty() ? List.of() : List.of(saleList.get(saleList.size() - 1));
    }

}
