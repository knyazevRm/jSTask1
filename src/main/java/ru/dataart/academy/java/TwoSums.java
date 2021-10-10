package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int firstIndex = i + 1;
            int lastIndex = nums.length - 1;

            while (firstIndex <= lastIndex) {
                int middleIndex = (firstIndex + lastIndex) / 2;

                if (nums[middleIndex] == target - nums[i]) {
                    return new int[]{nums[i], nums[middleIndex]};
                } else if (nums[middleIndex] < target - nums[i]) {
                    firstIndex = middleIndex + 1;
                } else if (nums[middleIndex] > target - nums[i]) {
                    lastIndex = middleIndex - 1;
                }

            }
        }
        return new int[]{};
    }
}
