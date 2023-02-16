package edu.craptocraft.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        List<Offer> firstCriteria = new ArrayList<Offer>(criteria.checkCriteria(sneaker));
        List<Offer> secondCriteria = new ArrayList<Offer>(otherCriteria.checkCriteria(sneaker));

        return secondCriteria.stream().filter(c -> c.size().equals(firstCriteria.get(0).size())).toList();
    }

}
