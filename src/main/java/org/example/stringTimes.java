package org.example;

public String stringTimes(String str, int n) {
    // Initialize an empty string to store the result
    String result = "";

    // Loop n times to concatenate str to result
    for (int i = 0; i < n; i++) {
        // Append str to result in each iteration
        result = result + str;  // could use result += str here as well
    }

    // Return the final concatenated string
    return result;
}
