1class Solution {
2    public int[] createTargetArray(int[] nums, int[] index) {
3        ArrayList<Integer> list = new ArrayList<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            list.add(index[i], nums[i]); // this shifts the already present
7        }
8        // newly created array for the return variable
9        int[] result = new int[list.size()];
10
11        // index for the for loop entry of list to array
12        int i = 0;
13        for (int x : list) {
14            result[i++] = x;
15        }
16
17        return result;
18
19    }
20}