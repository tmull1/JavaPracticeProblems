package org.example;

public int[] rotateLeft3(int[] nums) {
    // Create a new array to hold the rotated elements
    int[] rotated = new int[3];

    // The first element of the new array is the second element of the input array
    rotated[0] = nums[1];

    // The second element of the new array is the third element of the input array
    rotated[1] = nums[2];

    // The third element of the new array is the first element of the input array
    rotated[2] = nums[0];

    // Return the new array with the rotated elements
    return rotated;
}
