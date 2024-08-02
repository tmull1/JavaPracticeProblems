package org.example;

public String firstHalf(String str) {
    // Calculate the midpoint of the string, which is half its length
    int mid = str.length() / 2;

    // Return the substring from the beginning of the string up to the midpoint
    return str.substring(0, mid);
}
