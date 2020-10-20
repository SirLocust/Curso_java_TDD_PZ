package com.platzi.javatest.util;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

public class DateUtilShould {

    @Test
    public void return_true_when_year_is_divisible_by_400() {
        // assertTrue();
        MatcherAssert.assertThat(DateUtil.isLeapYear(1600), CoreMatchers.is(true));
        MatcherAssert.assertThat(DateUtil.isLeapYear(1600), CoreMatchers.is(true));
        MatcherAssert.assertThat(DateUtil.isLeapYear(1600), CoreMatchers.is(true));

    }

    @Test
    public void return_false_when_year_is_divisible_by_100_but_not_by_400() {
        MatcherAssert.assertThat(DateUtil.isLeapYear(1700), CoreMatchers.is(false));
        MatcherAssert.assertThat(DateUtil.isLeapYear(1800), CoreMatchers.is(false));

        MatcherAssert.assertThat(DateUtil.isLeapYear(1900), CoreMatchers.is(false));

    }

    @Test

    public void return_when_year_is_divisible_by_4_but_not_by_100() {
        MatcherAssert.assertThat(DateUtil.isLeapYear(1996), CoreMatchers.is(true));
        MatcherAssert.assertThat(DateUtil.isLeapYear(2004), CoreMatchers.is(true));
        MatcherAssert.assertThat(DateUtil.isLeapYear(2008), CoreMatchers.is(true));

    }

    @Test
    public void return_when_year_is_not_divisible_by_4() {
        MatcherAssert.assertThat(DateUtil.isLeapYear(2017), CoreMatchers.is(false));
        MatcherAssert.assertThat(DateUtil.isLeapYear(2018), CoreMatchers.is(false));

        MatcherAssert.assertThat(DateUtil.isLeapYear(2019), CoreMatchers.is(false));

    }

}
