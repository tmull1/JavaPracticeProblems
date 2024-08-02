package org.example;

public boolean sleepIn(boolean weekday, boolean vacation) {
    // If it is not a weekday or if we are on vacation, we can sleep in.
    // The logical OR operator (||) checks if either condition is true.
    if (!weekday || vacation) {
        return true; // We can sleep in if either condition is true.
    }

    return false; // If it is a weekday and we are not on vacation, we cannot sleep in.
}
