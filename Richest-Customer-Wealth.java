1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int count = 0;
4       for (int[] account: accounts) {
5        int sum = 0;
6           for (int main: account){
7            sum += main;
8           } 
9           count = Math.max(count, sum);
10       }
11       return count;
12    }
13}