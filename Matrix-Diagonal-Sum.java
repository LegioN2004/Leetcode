1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int r = mat.length;
4        int c = mat[0].length;
5        int sum = 0;
6        for (int i = 0; i < r; i++) {
7            {
8                // primary diagonal
9                sum += mat[i][i];
10                if(i != (c - i - 1)){
11                // secondary diagonal
12                sum += mat[i][c - i - 1];
13                }
14            }
15        }
16        return sum;
17    }
18}