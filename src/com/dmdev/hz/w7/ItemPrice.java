package com.dmdev.hz.w7;

public class ItemPrice {

    private final Integer id;
    private final Double price;

    public ItemPrice(String str) {
        if (str == null){
            id = 0;
            price = 0.0;
        } else {
            String[] strings = str.split(",");
            id = Integer.valueOf(strings[0]);
            price = Double.valueOf(strings[1]);
        }
    }

    public Integer getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ItemPrice{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
