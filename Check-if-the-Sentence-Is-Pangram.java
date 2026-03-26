1class Solution {
2    public boolean checkIfPangram(String sentence) {
3        sentence = sentence.toLowerCase();
4        boolean[] bool = new boolean[26];
5        // int count;
6
7        for (char c : sentence.toCharArray()) {
8            if (c >= 'a' && c <= 'z') {
9                bool[c - 'a'] = true;
10            } else {
11                break;
12            }
13        }
14
15        for (boolean b : bool) {
16            if (!b) {
17                return false;
18            }
19        }
20        return true;
21    }
22}