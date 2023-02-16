package edu.craptocraft.stockx.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class MinAsk implements Criteria {

    public MinAsk() {
    };

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream().filter(a -> a instanceof Ask).min(Comparator.comparing(Offer::value)).stream()
                .collect(Collectors.toList());
    }

}
