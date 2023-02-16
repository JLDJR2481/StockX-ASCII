package edu.craptocraft.stockx.criteria;

import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.List;

import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;

public class MaxBid implements Criteria {

    public MaxBid() {
    };

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream().filter(b -> b instanceof Bid).max(Comparator.comparing(Offer::value)).stream()
                .collect(Collectors.toList());
    }

}
