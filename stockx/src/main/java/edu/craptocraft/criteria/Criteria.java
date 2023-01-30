package edu.craptocraft.criteria;

import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public interface Criteria {

    List<Offer> checkCriteria(Item item);

}
