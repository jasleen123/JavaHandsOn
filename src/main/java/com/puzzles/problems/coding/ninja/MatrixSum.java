package com.puzzles.problems.coding.ninja;

import java.util.logging.Logger;

/*Replace every  element of nxm matrix with the sum of elements present on its right excluding current element (in current row only)*/
public class MatrixSum {
    int n;
    int m;

    public int[][] sampleMatrix = new int[n][m];

    public MatrixSum(int n, int m, int[][] sampleMatrix) {
        this.n = n;
        this.m = m;
        this.sampleMatrix = sampleMatrix;
    }
    public int[][] replaceWithSum() throws ArrayIndexOutOfBoundsException {
        try{
        for (int row = 0; row < n; row++) {
            int sum = 0;
            for (int col = 0; col < m; col++) {
                sum += sampleMatrix[row][col+1];
                //sampleMatrix[row][col] = sum;
            }
            System.out.println(sum);
        }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return sampleMatrix;
    }

    public void printOutputMatrix() {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(sampleMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {2, 4, 5, 3},
                {4, 4, 5, 1}
        };
        MatrixSum ob = new MatrixSum(3, 4, matrix);
        ob.replaceWithSum();
    }
}
