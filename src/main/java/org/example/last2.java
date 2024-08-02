package org.example;

public int last2(String str) {
    // too short string case.
    if (str.length() < 2) return 0;

    // Get the last 2 characters of the string
    String end = str.substring(str.length() - 2);
    // substring() with 1 value goes through the end of the string

    int count = 0;

    // Check each substring of length 2 starting at index i
    for (int i = 0; i < str.length() - 2; i++) {
        String sub = str.substring(i, i + 2);
        // Use .equals() to compare strings
        if (sub.equals(end)) {
            count++;
        }
    }

    // Return the count of occurrences
    return count;
}
