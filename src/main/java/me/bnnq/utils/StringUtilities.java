package me.bnnq.utils;

public class StringUtilities {
    public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
