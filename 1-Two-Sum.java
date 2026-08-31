class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int numsWithIndices[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            numsWithIndices[i][0] = nums[i];
            numsWithIndices[i][1] = i;
        }

        Arrays.sort(numsWithIndices, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n - 1;

        while (left < right) {
            if (target == numsWithIndices[left][0] + numsWithIndices[right][0])
                return new int[] { numsWithIndices[left][1], numsWithIndices[right][1] };
            else if (target > numsWithIndices[left][0] + numsWithIndices[right][0])
                left++;
            else
                right--;
        }
        return new int[] { -1, -1 };
    }
}