package org.example;

public int[] maxEnd3(int[] nums) {
    // Determine the larger value between the first and last elements of the array
    int larger = Math.max(nums[0], nums[2]);

    // Set the first element of the array to the larger value
    nums[0] = larger;

    // Set the second element of the array to the larger value
    nums[1] = larger;

    // Set the third element of the array to the larger value
    nums[2] = larger;

    // Return the modified array with all elements set to the larger value
    return nums;
}

