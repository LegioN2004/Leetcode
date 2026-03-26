1
2import java.util.Arrays;
3
4class Solution {
5    public int[] sortedSquares(int[] nums) {
6        int[] sum = new int[nums.length];
7        for (int i = 0; i < nums.length; i++) {
8            sum[i] = nums[i] * nums[i];
9        }
10        Arrays.sort(sum);
11        return sum;
12    }
13}