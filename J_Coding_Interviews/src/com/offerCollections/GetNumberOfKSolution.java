package com.offerCollections;

/**
 * 统计一个数字在排序数组中出现的次数。
 * 
 * @author zhengzhentao
 *
 */
public class GetNumberOfKSolution {

	public GetNumberOfKSolution() {
		// TODO Auto-generated constructor stub
	}

	public static int GetNumberOfK(int[] array, int k) {
		// 考虑边界以及异常值
		if (array.length == 0) {
			return 0;
		}
		int times = 0;
		for (int i : array) {
			if (i > k) {
				break;
			}
			if (i == k) {
				times++;
			}
		}
		return times;
	}
	
//	使用二分查找
	public static int GetNumberOfK1(int[] array, int k) {
		return k;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 0, 1, 2, 3, 4, 5, 5, 5, 6, 6 };
		int times = GetNumberOfK(array, 5);
		System.out.println("出现的次数是：" + times);
	}

}
