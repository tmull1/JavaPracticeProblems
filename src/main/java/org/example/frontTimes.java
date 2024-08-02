package org.example;

public String frontTimes(String str, int n) {
    // Define the length of the substring we want from the front of the string
    int frontLen = 3;

    // If the string is shorter than 3 characters, use its actual length
    if (frontLen > str.length()) {
        frontLen = str.length();
    }

    // Extract the substring from the front of the string
    String front = str.substring(0, frontLen);

    // Initialize an empty string to store the result
    String result = "";

    // Loop n times to concatenate the front substring to result
    for (int i = 0; i < n; i++) {
        // Append the front substring to result in each iteration
        result = result + front;
    }

    // Return the final concatenated string
    return result;
}
