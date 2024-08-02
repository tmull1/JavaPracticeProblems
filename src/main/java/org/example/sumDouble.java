package org.example;

public int sumDouble(int a, int b) {
    // Store the sum of a and b in a local variable
    int sum = a + b;

    // Check if a and b are the same
    if (a == b) {
        // If they are the same, double the sum
        sum = sum * 2;
    }

    // Return the final sum (doubled if a and b were the same)
    return sum;
}
