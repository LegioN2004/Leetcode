1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int pairs = 0;
4        for (int i = 0; i < nums.length; i++) {
5            for (int j = 0; j < i; j++) {
6                if(nums[i] == nums[j]){
7                    pairs += 1;
8                }
9            }
10        }
11        return pairs;
12    }
13}