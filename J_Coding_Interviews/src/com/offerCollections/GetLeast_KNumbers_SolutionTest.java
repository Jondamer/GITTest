package com.offerCollections;

import java.util.ArrayList;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * 
 * @author zhengzhentao
 *
 */
public class GetLeast_KNumbers_SolutionTest {

	public GetLeast_KNumbers_SolutionTest() {
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] bubble, int k) {
		ArrayList<Integer> LeastKNumbers = new ArrayList<>();
		int leng = bubble.length;
		if (leng == 0)
			return LeastKNumbers;
		if (k > leng || k == 0)
			return LeastKNumbers;
		for (int i = 0; i < k; i++) {
			for (int j = leng - 1; j > i; j--) {
				if (bubble[j - 1] > bubble[j]) { // 如果前面的元素大于后面的元素则交换位置；
					int temp = bubble[j];
					bubble[j] = bubble[j - 1];
					bubble[j - 1] = temp;
				}
			}
		}
		// 遍历前K个元素，保存前K个元素
		for (int i = 0; i < k; i++) {
			LeastKNumbers.add(bubble[i]);
		}
		return LeastKNumbers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 测试数组
		int[] bubble = { 1, 4, 8, 9, 3, 6, 2, 5, 66, 91 };
		ArrayList<Integer> LeastKNumbers = new ArrayList<>();
		LeastKNumbers = GetLeastNumbers_Solution(bubble, 4);
		for (Integer integer : LeastKNumbers) {
			System.out.println(integer);
		}

	}

}
