package com.offerCollections;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 输入：一个递增排序的数组和一个整型数字S.
 * 输出：在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。输出保存在ArrayList中。
 * 
 * @author zhengzhentao
 *
 */
public class FindNumbersWithSumSolution {

	public FindNumbersWithSumSolution() {
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> al = new ArrayList<>();
		int len = array.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if ((array[i] + array[j]) == sum) {
					al.add(array[i]);
					al.add(array[j]);
					return al;
				}
			}
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		ArrayList<Integer> al = new ArrayList<>();
		al = FindNumbersWithSum(arr, 6);
		for (Integer integer : al) {
			System.out.print(integer + "\t");
		}
	}

}
