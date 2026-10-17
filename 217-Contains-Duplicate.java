class Solution {
    public boolean containsDuplicate(int[] nums) {
        // return brute(nums);
        // return better(nums);
        // return OptimalSpace(nums);
        return OptimalTime(nums);
    }

    public boolean brute(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    public boolean better(int[] nums) {
        Map<Integer, Integer> mapr = new HashMap<>(); // O(nlogn)

        for (int i = 0; i < nums.length; i++) {
            mapr.merge(nums[i], 1, (oldValue, newValue) -> oldValue + 1);
        }

        for (int value : mapr.values()) {
            if (value >= 2)
                return true;
        }
        return false;
    }

    // Approach A: Sorting (In-place Optimal for Space). If the interviewer says: "Can you solve this without using O(N) extra memory?"
    // Algorithm: Sort the array first. Duplicates will be forced adjacent to each other. Then do a single linear pass comparing nums[i] == nums[i + 1].
    // Time Complexity: O(N log N) | Space Complexity: O(1) (or O(log N) depending on the internal dual-pivot Quicksort call stack).
    public boolean OptimalSpace(int nums[]) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }

        return false;
    }

    //    Approach B: Single-Pass HashSet (Optimal for Time)If runtime speed is the top priority, use a HashSet instead of a full frequency HashMap
    // Time Complexity: O(N) average | Space Complexity: O(N).
    // Why it's better than the HashMap: It operates in a single pass and exits early the moment the first duplicate is encountered, without wasting memory storing redundant frequency values. 

    public boolean OptimalTime(int nums[]) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }
}
