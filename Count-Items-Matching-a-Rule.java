1class Solution {
2    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
3        int index = 0, count = 0;
4
5        // setting indexes for the ruleKey
6        if (ruleKey.equals("type")) {
7            index = 0;
8        } else if (ruleKey.equals("color")) {
9            index = 1;
10        } else
11            index = 2;
12
13        for (int i = 0; i < items.size(); i++) {
14            // first get(i) gets the first part of the array and iterates it, then the next get gets the ruleKey and checks with ruleValue
15            if (items.get(i).get(index).equals(ruleValue))
16                count += 1;
17        }
18        return count;
19    }
20}