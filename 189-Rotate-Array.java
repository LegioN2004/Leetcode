class Solution {
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }
}

// look below

// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;

//         // 1. Handle edge case where k is larger than the array length
//         k = k % n; 
//         if (k == 0) return;

//         // 2. For a right rotation, we need to save the LAST k elements, 
//         // because they are going to get overwritten first.
//         int temp[] = new int[k];
//         int tempIndex = 0;
//         for (int i = n - k; i < n; i++) {
//             temp[tempIndex] = nums[i];
//             tempIndex++;
//         }

//         // 3. Shift the remaining elements from the front to the back
//         for (int i = n - k - 1; i >= 0; i--) {
//             nums[i + k] = nums[i];
//         }

//         // 4. Place the saved temp elements back into the front of the array
//         for (int i = 0; i < k; i++) {
//             nums[i] = temp[i];
//         }
//     }
// }