package org.example;

public String makeOutWord(String out, String word) {
    // Extract the first part of the "out" string (the first two characters)
    String firstPart = out.substring(0, 2);

    // Extract the second part of the "out" string (the last two characters)
    String secondPart = out.substring(2, 4);

    // Concatenate the first part, the word, and the second part to form the new string
    return firstPart + word + secondPart;
}
