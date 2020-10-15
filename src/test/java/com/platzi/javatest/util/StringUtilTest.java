package com.platzi.javatest.util;

public class StringUtilTest {

    public static void main(String... args) {

        checkEquals(StringUtil.repeat("hola", 3), "holaholahola");

        checkEquals(StringUtil.repeat("hola", 1), "hola");

    }

    private static void checkEquals(String actual, String strExpected) {

        if (!actual.equals(strExpected)) {
            throw new RuntimeException(actual + " is not equal that " + strExpected);
        }
    }
}
