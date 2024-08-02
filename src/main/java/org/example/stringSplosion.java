package org.example;

public String stringSplosion(String str) {
    // Initialize an empty result string
    String result = "";

    // Loop through each character in the input string
    for (int i = 0; i < str.length(); i++) {
        // Append the substring from the start to the current character (inclusive) to the result
        result = result + str.substring(0, i + 1);
    }

    // Return the final result string
    return result;
}
