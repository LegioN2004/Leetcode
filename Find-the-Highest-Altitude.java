1class Solution {
2    public int largestAltitude(int[] gain) {
3        int max = 0;
4        int current = 0;
5        for (int i = 0; i < gain.length; i++) {
6            current += gain[i];
7            if (current > max) {
8                max = current;
9            }
10        }
11        return max;
12    }
13}