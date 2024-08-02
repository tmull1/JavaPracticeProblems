package org.example;

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    // If both monkeys are smiling, we are in trouble.
    if (aSmile && bSmile) {
        return true; // Return true because both monkeys are smiling.
    }

    // If neither of the monkeys is smiling, we are also in trouble.
    if (!aSmile && !bSmile) {
        return true; // Return true because neither monkey is smiling.
    }

    // If one monkey is smiling and the other is not, we are not in trouble.
    return false; // Return false because only one monkey is smiling.
}
