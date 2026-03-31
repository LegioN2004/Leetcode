1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        int n = image.length;
4        int[][] ans = new int[n][n];
5        for (int i = 0; i < image.length; i++) {
6            int index = 0;
7            for (int j = image[0].length - 1; j >= 0; j--) {
8                ans[i][index] = image[i][j];
9                index++;
10            }
11        }
12        for (int i = 0; i < image.length; i++) {
13            for (int j = 0; j < image[i].length; j++) {
14                if(ans[i][j] == 1)
15                    ans[i][j] = 0;
16                else if(ans[i][j] == 0)
17                    ans[i][j] = 1;
18            }
19        }
20        return ans;
21    }
22}