package p2373;

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int maxLocalLen = grid.length - 2;
        int[][] maxLocal = new int[maxLocalLen][maxLocalLen];

        for (int i = 0; i < maxLocalLen; i++) {
            for (int j = 0; j < maxLocalLen; j++) {
                int max = 0;
                for (int k = i; k < i + 3; k++)
                    for (int l = j; l < j + 3; l++)
                        if (grid[k][l] > max)
                            max = grid[k][l];
                maxLocal[i][j] = max;
            }
        }
        return maxLocal;
    }
}