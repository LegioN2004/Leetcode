1class Solution {
2    public int oddCells(int m, int n, int[][] indices) {
3        int[][] ans = new int[m][n];
4        int odd = 0;
5        // not needed this following since by default any new keyword array initializes all the values to 0
6        // for (int i = 0; i < m; i++)
7        //     for (int j = 0; j < n; j++)
8        //         ans[i][j] = 0;
9
10        for (int i = 0; i < indices.length /* 2 */; i++) {
11            for (int j = 0; j < n; j++) {
12                ans[indices[i][0]][j]++ ;
13            }
14            for (int j = 0; j < m; j++) {
15                ans[j][indices[i][1]]++ ;
16            }
17        }
18
19        for (int i = 0; i < m; i++) {
20            for (int j = 0; j < n; j++) {
21                if (ans[i][j] % 2 != 0) {
22                    odd++;
23                }
24            }
25        }
26        return odd;
27    }
28}