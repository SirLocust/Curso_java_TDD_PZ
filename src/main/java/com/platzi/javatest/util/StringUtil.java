package com.platzi.javatest.util;

/**
 * The Stack class represents a last-in-first-out stack of objects.
 *
 * @author juan gomez
 * @version 1.0 Note that this version is not thread safe.
 */
public class StringUtil {

    public static String repeat(String str, int times) {

        if (times < 0) {
            throw new IllegalArgumentException("negative times not allowed");
        }

        String result = "";

        for (int i = 0; i < times; i++) {
            result += str;
        }

        return result;
    }
}
