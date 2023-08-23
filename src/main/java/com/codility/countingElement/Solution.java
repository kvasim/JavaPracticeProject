package com.codility.countingElement;

public class Solution {
    public int solution(int M, int N) {
        int minMN = Math.min(M, N / 2);
        int maxSquareSize = 0;

        // Try different combinations of 2×2 and 1×1 tiles
        for (int i = minMN; i >= 0; i--) {
            int remaining1x1Tiles = M - i;
            int maxSquareSize1x1 = Math.min(remaining1x1Tiles, N - 2 * i);
            int currentSquareSize = i * 2 + maxSquareSize1x1;

            maxSquareSize = Math.max(maxSquareSize, currentSquareSize);
        }

        return maxSquareSize;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int M = 8;
        int N = 0;
        int maxSideLength = solution.solution(M, N);
        System.out.println("The largest possible square that can be created is of side length: " + maxSideLength);
    }

}
