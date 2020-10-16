package com.platzi.javatest.util;

public class PasswordUtli {

    public enum SecurityLeven {
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLeven assesPassword(String password) {
        if (password.length() < 8) {
            return SecurityLeven.WEAK;
        }
        if (password.matches("[a-zA-Z]+")) {
            return SecurityLeven.WEAK;
        }
        if (password.matches("[A-Za-z0-9]+")) {
            return SecurityLeven.MEDIUM;
        }

        return SecurityLeven.STRONG;
    }
}
