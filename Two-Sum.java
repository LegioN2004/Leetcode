1
2import java.util.HashMap;
3import java.util.Map;
4
5class Solution {
6    public int[] twoSum(int[] nums, int target) {
7        int[] result = new int[2];
8        Map<Integer, Integer> map = new HashMap<>();
9        for (int i = 0; i < nums.length; i++) {
10            if (map.containsKey(target - nums[i])) {
11                result[0] = map.get(target - nums[i]);
12                result[1] = i;
13                return result;
14            }
15            map.put(nums[i], i);
16        }
17        return result;
18    }
19}