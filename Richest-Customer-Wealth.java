1class Solution {
2    public int maximumWealth(int[][] accounts) {
3    int max = 0;
4    for (int m = 0; m < accounts.length; m++) {
5        int b = 0;
6        for (int n = 0; n < accounts[m].length; n++) {
7        b = b + accounts[m][n];
8          if(b > max) {
9              max = b;
10          }
11      }
12    }
13    return max;
14    }
15}