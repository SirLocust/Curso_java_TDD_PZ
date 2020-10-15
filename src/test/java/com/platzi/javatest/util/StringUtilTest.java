package com.platzi.javatest.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilTest {

    @Test
    public void repeat_string_once() {

        assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        assertEquals("holaholahola", StringUtil.repeat("hola", 3));

    }

    @Test
    public void repeat_string_zero_times() {
        assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test
    public void repeat_string_negative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {

            StringUtil.repeat("hola", -1);
        });
    }

}
