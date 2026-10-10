class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length * 2;
        int[] newArr = new int[n];
        int j = 0;

        for (int i = 0; i < nums.length && j < n; i++) {
            newArr[j] = nums[i];
            if (i == nums.length - 1) i = -1;
            j++;
        }

        return newArr;
    }
}

// best solution below
// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[2 * n];
//         for (int i = 0; i < n; i++) {
//             ans[i] = nums[i];
//             ans[i + n] = nums[i];
//         }
//         return ans;
//     }
// }