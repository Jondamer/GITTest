package com.offerCollections;

/**
 * 统计一个数字在排序数组中出现的次数。
 * 
 * @author zhengzhentao
 *
 */
public class GetNumberOfKSolutionV2 {

	/**
	 * 二分查找的变形 1.查找第一个与key相等的元素位置 2.查找最后一个与key相等的元素位置
	 * 
	 * @param args
	 */

	// 查找第一个相等的元素
	static int findFirstEqual(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;

		// 这里必须是 <=
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] >= key) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		if (left < array.length && array[left] == key) {
			return left;
		}

		return -1;
	}

	// 查找最后一个相等的元素
	static int findLastEqual(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;
		// 这里必须是 <=
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] <= key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		if (right >= 0 && array[right] == key) {
			return right;
		}
		return -1;
	}
	public static int GetNumberOfK(int [] array , int k) {
		int firstEqual=findFirstEqual(array,k);
		int lastEqual =findLastEqual(array, k);
		if(firstEqual==-1)
			return 0;
		int times=lastEqual-firstEqual+1;
		return times;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 0, 1, 2, 3, 4, 5, 5, 5, 6, 6 };
		int times = GetNumberOfK(array, 5);
		System.out.println("出现的次数是：" + times);

	}

}
