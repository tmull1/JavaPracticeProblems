package org.example;

public int arrayCount9(int[] nums) {
    // Initialize a counter to keep track of the number of 9s
    int count = 0;

    // Loop through each element in the array
    for (int i = 0; i < nums.length; i++) {
        // If the current element is 9, increment the counter
        if (nums[i] == 9) {
            count++;
        }
    }

    // Return the total count of 9s in the array
    return count;
}

