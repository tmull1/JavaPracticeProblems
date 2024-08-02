package org.example;

public boolean nearHundred(int n) {
    // Check if the absolute difference between 100 and n is less than or equal to 10
    // OR check if the absolute difference between 200 and n is less than or equal to 10
    return ((Math.abs(100 - n) <= 10) ||
            (Math.abs(200 - n) <= 10));
}