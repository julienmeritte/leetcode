class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int y = i + 1; y < nums.length; y++) {
                if (nums[i] + nums[y] == target) {
                    return new int[]{i, y};
                }
            }
        }
        return new int[2];
    }
}