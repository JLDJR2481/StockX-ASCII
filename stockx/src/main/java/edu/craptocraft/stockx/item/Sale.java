package edu.craptocraft.stockx.item;

public class Sale implements Offer {

    private String size;
    private Integer price;

    public Sale(String size, int price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.price;

    }

    @Override
    public int compareTo(Offer offer) {
        return this.price.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "\t\t" + this.size + "\t" + this.value() + "\n";
    }

}
