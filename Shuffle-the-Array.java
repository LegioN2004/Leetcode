1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] a = new int[nums.length];
4		int b = n - 1;
5		for (int i = 0; i < n; i++) {
6			a[2*i] = nums[i];
7			a[2*i + 1] = nums[2*i + b + 1];
8			b--;
9		}
10		return a;
11    }
12}