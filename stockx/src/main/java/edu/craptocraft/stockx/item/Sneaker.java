package edu.craptocraft.stockx.item;

public class Sneaker implements Item {

    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public int getBid() {
        return this.bid;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    @Override
    public String toString() {
        return "\t" + this.name + "\t" + "\n\t\t" + this.style;
    }

}
