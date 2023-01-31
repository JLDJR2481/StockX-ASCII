package edu.craptocraft.stockx.criteria;

import java.util.Optional;
import java.util.List;

import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Item;

public class Min implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public Min(Criteria criteria, Criteria otherCriteria) {

        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        Criteria andCriteria = new AndCriteria(criteria, otherCriteria);

        Optional<Offer> offer = andCriteria.checkCriteria(sneaker).stream().min(Offer::compareTo);

        return offer.isPresent() ? List.of(offer.get()) : List.of();

    }

}
