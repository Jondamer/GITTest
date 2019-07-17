package com.offerCollections;

/**
 * 输入：整数数组，数组长度，保存重复数字的整数数组。 输出：布尔值。如果输入的整数数组是有效的，并且含有重复的数字，则返回值为true，否则为false
 * 
 * @author zhengzhentao
 *
 */
public class DuplicateSolution {

	public DuplicateSolution() {
		// TODO Auto-generated constructor stub
	}

	// Parameters:
	// numbers: an array of integers
	// length: the length of array numbers
	// duplication: (Output) the duplicated number in the array number,length of
	// duplication array is 1,so using duplication[0] = ? in implementation;
	// Here duplication like pointor in C/C++, duplication[0] equal *duplication
	// in C/C++
	// 这里要特别注意~返回任意重复的一个，赋值duplication[0]
	// Return value: true if the input is valid, and there are some duplications
	// in the array number
	// otherwise false
	public static boolean duplicate(int numbers[], int length, int[] duplication) {
		if (numbers == null || numbers.length == 0)
			return false;
		boolean dup = false;
		int len = numbers.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (numbers[i] == numbers[j]) {
					duplication[0] = numbers[i];
					System.out.println(duplication[0]);
					dup = true;
					return true;

				}

			}
		}
		return dup;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 测试
		int[] duplication = new int[1];
		int[] arrays = { 2, 3, 1, 0, 2, 5, 3 };
		boolean dup = duplicate(arrays, 7, duplication);
		System.out.println(dup);
	}

}
