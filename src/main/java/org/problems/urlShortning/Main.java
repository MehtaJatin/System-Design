package org.problems.urlShortning;

public class Main {
    public static void main(String[] args) {
        URLMapper shortener = new URLMapper();
        System.out.println("Short URL: " + shortener.shorten("https://www.google.com/asdfasfasfdadffsdsfaf", "abc"));
        System.out.println();
        System.out.println("Short URL: " + shortener.shorten("https://www.faceook.com/asdfjasodjfj", "abc"));
        System.out.println();
        System.out.println("Short URL: " + shortener.shorten("https://www.google.com/asdfasfasfdadffsdsfaf", "abc"));
        System.out.println();
        System.out.println("Long URL: " + shortener.getLongUrl("00004c92"));
    }
}
