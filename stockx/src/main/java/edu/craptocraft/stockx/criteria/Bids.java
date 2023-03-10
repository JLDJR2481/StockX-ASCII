package edu.craptocraft.stockx.criteria;

import java.util.List;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Bids implements Criteria {
    public Bids() {
    };

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream().filter(b -> b instanceof Bid).toList();

    }

}
