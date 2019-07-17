package com.offerCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 连续子数组的最大和
 * 问题输入(I):含有整数，负数的整型数组。
        问题输出(O):连续子向量的最大和。
   P:率先想到的思路是：每次得到一个输入数组的子数组，就计算对应子数组的和，和maxSum比较。最后得到输入数组的子数组的最小值。
 * @author zhengzhentao
 *
 */
public class FindGreatestSumOfSubArraySolution {

	public FindGreatestSumOfSubArraySolution() {
		// TODO Auto-generated constructor stub
	}

	public static int[] getSubArrays(int[] num, int i, int j) {
		int newArray[] = new int[j - i + 1];
		for (int k = 0; k < j - i + 1; k++) {
			newArray[k] = num[i];
			i++;
		}
		return num;

	}

	// 声明一个方法，求一个整型数组的所有子数组
	public static ArrayList<int[]> subArray(int[] array) {
		ArrayList<int[]> subArrays = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length + 1; j++) {
				int temp[] = Arrays.copyOfRange(array, i, j);
				System.out.println("当前的子数组是");
				for (int k : temp) {
					System.out.print(k + "\t");
				}
				System.out.println("\n");
				subArrays.add(temp);
			}
		}
		return subArrays;

	}

	// 求一个数组的和
	public static int sumOfArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	// 声明一个方法，求一个整型数组的所有子数组的和的最大值
	public static int subArrayMAXSum(int[] array) {
		int maxSum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length + 1; j++) {
				int temp[] = Arrays.copyOfRange(array, i, j);
				int tempSum = sumOfArray(temp);
				if (maxSum < tempSum) {
					maxSum = tempSum;
				}
			}
		}
		return maxSum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 测试数组
		int[] bubble = { 1, 24, -6, 8 };
		int[] bubble2 = { 100, 4, -6, 8, 9, 3, -3, 6, 2 };
		int[] bubble3 = { 1, 4, -6, 8, 9, 3, -3, 6, 2 };
		ArrayList<int[]> subArray = new ArrayList<>();
		subArray.add(bubble);
		subArray.add(bubble2);
		subArray.add(bubble3);
		// 求subArray的数组的集合的最大值
		int maxSum = 0;
		for (int i = 0; i < subArray.size(); i++) {
			// 定义一个临时的整型数组
			int[] temp = subArray.get(i);
			int tempSum = sumOfArray(temp);
			if (maxSum < tempSum) {
				maxSum = tempSum;
			}
		}
		// 求子数组的和的最大值
		System.out.println(maxSum);

		// 测试 Arrays.copyOfRange(T[ ] original,int from,int to)方法的使用
		// int [] test = Arrays.copyOfRange(bubble, 0,9);
		// for (int i : test) {
		// System.out.println(i);
		// }

		// 测试求子数组的方法
		ArrayList<int[]> subArrayTest = new ArrayList<>();
		subArrayTest = subArray(bubble);
		System.out.println("子数组的数目是:" + subArrayTest.size());
		for (int[] is : subArrayTest) {
			for (int j = 0; j < is.length; j++) {
				System.out.print(is[j] + "\t");
			}
			System.out.println("\n");
		}		
//		测试子数组的和的最大值	
		int MaxSUM = subArrayMAXSum(bubble);
		System.out.println("bubble数组的子数组的和的最大值："+MaxSUM);
	}
}
