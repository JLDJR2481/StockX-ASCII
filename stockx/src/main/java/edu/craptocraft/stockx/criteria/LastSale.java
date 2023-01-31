package edu.craptocraft.stockx.criteria;

import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class LastSale implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        Criteria sales = new Sales();
        List<Offer> salesList = sales.checkCriteria(sneaker);

        return salesList.isEmpty() ? List.of() : List.of(salesList.get(salesList.size() - 1));
    }

}
