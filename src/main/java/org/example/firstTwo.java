package org.example;

public String firstTwo(String str) {
    // Check if the string length is less than 2
    if (str.length() < 2) {
        // If the string is shorter than length 2, return the entire string
        return str;
    } else {
        // If the string length is 2 or more, return the substring containing the first two characters
        return str.substring(0, 2);
    }
}
