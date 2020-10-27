package com.platzi.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> priceList = new ArrayList<>();
    private double discount = 0;

    public double getTotal() {
        double total = 0;
        if (!priceList.isEmpty()) {
            for (int i = 0; i < priceList.size(); i++) {
                total += priceList.get(i);
            }
        }
        return total * ((100 - this.discount) / 100);
    }

    public void addPrice(double price) {
        this.priceList.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
