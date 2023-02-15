package edu.craptocraft.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {

    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> offers = new ArrayList<Offer>();

    public Sneaker(
            String style, String name) {
        this.style = style;
        this.name = name;
    }

    public Object getName() {
        return this.name;
    }

    public Object getStyle() {
        return this.style;
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    @Override
    public List<Offer> offers() {
        return this.offers;
    }

    public void add(Offer offer) {
        offers().add(offer);
    }

    @Override
    public String toString() {
        return "\t" + this.name + "\t" + "\n\t\t" + this.style;
    }

}
