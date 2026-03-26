1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int rows = matrix.length, columns = matrix[0].length;
4        int[][] output = new int[columns][rows];
5        for (int i = 0; i < rows; i++) {
6            for (int j = 0; j < columns; j++) {
7                output[j][i] = matrix[i][j];
8            }
9        }
10        return output;
11    }
12}