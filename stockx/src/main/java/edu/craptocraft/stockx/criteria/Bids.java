package edu.craptocraft.stockx.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Item;

public class Bids implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream().filter(b -> b instanceof Bid).sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

}
