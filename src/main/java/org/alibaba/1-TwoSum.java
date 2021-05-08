package org.alibaba;

class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int n = i + 1; n < length; n++) {
                if (nums[i] + nums[n] == target) {
                    return new int[]{i, n};
                }
            }
        }
        return new int[]{};
    }
}
