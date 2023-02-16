package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Max implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public Max(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        Criteria andCriteria = new AndCriteria(criteria, otherCriteria);

        Optional<Offer> filteredOffer = andCriteria.checkCriteria(sneaker).stream().max(Offer::compareTo);

        return filteredOffer.isPresent() ? List.of(filteredOffer.get()) : List.of();

    }

}
