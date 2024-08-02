package org.example;

public boolean array123(int[] nums) {
    // Loop through the array, stopping 2 elements before the end to prevent out-of-bounds errors
    for (int i = 0; i < (nums.length - 2); i++) {
        // Check if the current element is 1, the next element is 2, and the element after that is 3
        if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
            // If the sequence 1, 2, 3 is found, return true
            return true;
        }
    }
    // If the loop completes without finding the sequence, return false
    return false;
}
