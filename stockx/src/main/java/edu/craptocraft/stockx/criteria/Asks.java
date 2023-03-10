package edu.craptocraft.stockx.criteria;

import java.util.List;

import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Ask;

public class Asks implements Criteria {

    public Asks() {
    };

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        return sneaker.offers().stream().filter(a -> a instanceof Ask).toList();

    }

}
