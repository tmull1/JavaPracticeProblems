package org.example;

boolean doubleX(String str) {
    // Find the index of the first occurrence of "x"
    int i = str.indexOf("x");

    // If there is no "x" in the string, return false
    if (i == -1) return false; // no "x" at all

    // Check if i+1 is within the bounds of the string
    if (i + 1 >= str.length()) return false; // check i+1 in bounds?

    // Check if the next character is also "x"
    return str.substring(i + 1, i + 2).equals("x");
}
