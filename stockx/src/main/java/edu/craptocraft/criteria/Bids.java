package edu.craptocraft.criteria;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {

        return item.offers().stream().filter(i -> i instanceof Bid).collect(Collectors.toList());

    }

}
