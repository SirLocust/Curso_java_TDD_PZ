package com.platzi.discounts;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class PriceCalculatorShould {

    PriceCalculator calculator;

    @BeforeAll
    public void setup() {
        this.calculator = new PriceCalculator();
    }

    @Test
    public void total_zero_when_there_are_price() {

        MatcherAssert.assertThat(this.calculator.getTotal(), CoreMatchers.is(0.0));
    }

    @Test
    public void total_is_the_sum_of_prices() {
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);
        MatcherAssert.assertThat(this.calculator.getTotal(), CoreMatchers.is(25.7));
    }

    @Test
    public void apply_discount_to_price() {
        calculator.addPrice(100.0);
        calculator.addPrice(100.0);

        calculator.setDiscount(25);
        MatcherAssert.assertThat(this.calculator.getTotal(), CoreMatchers.is(150.0));
    }
}
