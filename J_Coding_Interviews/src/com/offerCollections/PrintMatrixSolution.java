package com.offerCollections;

import java.util.ArrayList;

/**
 * 
 * @author zhengzhentao
 *
 */
public class PrintMatrixSolution {

	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> matrixList = new ArrayList<Integer>();
		if (matrix == null || matrix.length == 0) {
			return null;
		}
		int row = matrix.length; // 行
		int col = matrix[0].length; // 列
		int start = 0;
		while (col > start * 2 && row > start * 2) { // 从外圈到内圈
			int endX = col - start - 1;
			int endY = row - start - 1;
			for (int i = start; i <= endX; i++) { // 从左到右
				matrixList.add(matrix[start][i]);
			}
			if (start < endY) {
				for (int i = start + 1; i <= endY; i++) { // 从下到上
					matrixList.add(matrix[i][endX]);
				}
			}
			if (start < endX && start < endY) {
				for (int i = endX - 1; i >= start; i--) { // 从右到左
					matrixList.add(matrix[endY][i]);
				}
			}
			if (start < endX && start < endY - 1) {
				for (int i = endY - 1; i >= start + 1; i--) { // 从下到上
					matrixList.add(matrix[i][start]);
				}
			}
			start++;
		}
		for (int i = 0; i < matrixList.size(); i++) {
			System.out.print(matrixList.get(i) + " ");
		}
		return matrixList;
	}

	// 用一维数组建立行尾row，列为col的矩阵（二维数组）
	public int[][] createMatrix(int[] arr, int col, int row) {
		int[][] matrix = new int[row][col];
		int i = 0;

		for (int j = 0; j < row; j++) { // 逐行写入
			for (int k = 0; k < col; k++) {
				if (matrix[j][k] == 0) {
					matrix[j][k] = arr[i++];
				}
			}
		}
		return matrix;
	}

	// 逐行打印矩阵
	public void printMatrixOriginal(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}


	
	public static void main(String[] args) {
		PrintMatrixSolution test = new PrintMatrixSolution();
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int[][] matrix = test.createMatrix(arr, 4, 4);
		System.out.println("原来创建的矩阵：");
		test.printMatrixOriginal(matrix);
		System.out.println("顺时针打印矩阵：");
		test.printMatrix(matrix);
	}

}
