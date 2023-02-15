package edu.craptocraft.stockx.item;

public interface Offer {

    String size();

    int value();

    int compareTo(Offer offer);

}
