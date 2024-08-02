package org.example;

public String notString(String str) {
    // Check if the string length is at least 3 and if the first 3 characters are "not"
    if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
        // If the string already starts with "not", return the string as is
        return str;
    }

    // If the string does not start with "not", add "not " to the beginning and return the result
    return "not " + str;
}
