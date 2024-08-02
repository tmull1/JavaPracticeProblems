package org.example;

public int diff21(int n) {
    // If n is less than or equal to 21
    if (n <= 21) {
        // Return the difference between 21 and n
        return 21 - n;
    } else {
        // If n is greater than 21, return double the absolute difference between n and 21
        return (n - 21) * 2;
    }
}

