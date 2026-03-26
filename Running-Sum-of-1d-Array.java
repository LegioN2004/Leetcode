1class Solution {
2    public int[] runningSum(int[] nums) {
3        int hello = 0;
4        for (int i = 0; i < nums.length; i++) {
5            hello += nums[i];
6            nums[i] = hello;
7        }
8        return nums;
9    }
10}