package com.offerCollections;

import java.util.ArrayList;

/**
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序 输入(I):正整数S
 * 输出(O):S的连续正数序列,保存在泛型为ArrayList的ArrayList里。正整数序列至少包含两个数。
 * 
 * @author zhengzhentao
 *
 */
public class FindContinuousSequenceSolution {

	public FindContinuousSequenceSolution() {
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> sq = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		if (sum == 1)
			return sq;
//		ArrayList<ArrayList<Integer>> sq = new ArrayList<>();
//		ArrayList<Integer> temp = new ArrayList<>();
		// 调用函数
		for (int i = 1; i < sum ; i++) {
			for (int j = i+1; j < sum ; j++) {
				if (sumI_J(i, j) == sum) {
					// 调用函数
					temp = addArrayList(i, j);
					sq.add(temp);
				}
			}
		}
		return sq;

	}
	// 声明一个静态方法，计算区间[i,j]之间的累加和

	public static int sumI_J(int i, int j) {
		// int sum = 0;
		// for (int k = i; k <= j; k++) {
		// sum = sum + k;
		// }
		//
		int sum2 = (i + j) * (j - i + 1) / 2;
		return sum2;
	}

	// 声明一个方法，把区间[i,j]之间的正整数保存到ArrayList中
	static ArrayList<Integer> addArrayList(int i, int j) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int k = i; k <= j; k++) {
			al.add(k);
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 测试方法 sumI_J
		// int tempSum = sumI_J(1, 100);
		// System.out.println(tempSum);

		// ArrayList<Integer> tempAL = new ArrayList<>();
		// tempAL = addArrayList(2, 5);
		// for (Integer integer : tempAL) {
		// System.out.println(integer);
		// }

		// 测试函数
		ArrayList<ArrayList<Integer>> sq = new ArrayList<>();

		sq = FindContinuousSequence(1);

		for (ArrayList<Integer> arrayList : sq) {
			for (Integer integer : arrayList) {
				System.out.print(integer + "\t");
			}
			System.out.println("\n");
		}

	}

}
