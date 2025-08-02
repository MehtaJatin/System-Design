package org.problems.urlShortning;

public class Base62Encoder {
    private static final String BASE62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int BASE = BASE62.length();

    public static String encode(long value) {
        if (value == 0) return "0";

        StringBuilder sb = new StringBuilder();
        while (value > 0) {
            int index = (int) (value % BASE);
            sb.append(BASE62.charAt(index));
            value /= BASE;
        }
        return sb.reverse().toString();
    }

    public static long decode(String input) {
        long result = 0;
        for (int i = 0; i < input.length(); i++) {
            result = result * BASE + BASE62.indexOf(input.charAt(i));
        }
        return result;
    }
}
