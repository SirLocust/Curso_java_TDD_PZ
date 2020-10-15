package com.platzi.javatest.util;

import static com.platzi.javatest.util.PasswordUtli.SecurityLeven.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtli.assesPassword("1234567"));
    };

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtli.assesPassword("asewqdasd"));

    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtli.assesPassword("abcd1234"));
    }

    @Test
    void strong_when_has_letters_and_numbers_symbols() {
        assertEquals(STRONG, PasswordUtli.assesPassword("abcd231***"));
    }

}
