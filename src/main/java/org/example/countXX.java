package org.example;

int countXX(String str) {
    // Initialize a counter to keep track of the occurrences of "xx"
    int count = 0;

    // Loop through the string, stopping at the second-to-last character
    for (int i = 0; i < str.length() - 1; i++) {
        // Check if the substring starting at index i and of length 2 equals "xx"
        if (str.substring(i, i + 2).equals("xx")) {
            count++; // Increment the counter if "xx" is found
        }
    }

    // Return the total count of "xx" substrings
    return count;
}

