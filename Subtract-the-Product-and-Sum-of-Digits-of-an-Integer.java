1class Solution {
2    public int subtractProductAndSum(int n) {
3        int product = 1, sum = 0;
4
5        while (n > 0) {
6            int c = n % 10;
7            product = product * c;
8            sum = sum + c;
9            n = n / 10;
10        }
11        return product-sum;
12    }  
13}