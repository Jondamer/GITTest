package com.offerCollections;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 
 * @author zhengzhentao
 *
 */
public class MoreThanHalfNum_SolutionTest {

	public static int MoreThanHalfNum_Solution(int[] array) {
		// 考虑异常情况
		if (array.length == 0)
			return 0;
		// 使用hashMap来保存数组中的元素，其中map的key是 数组的元素，value 是key出现的次数
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int key, value = 1;
		// 遍历数组元素并添加到map中
		for (int i = 0; i < array.length; i++) {
			key = array[i];
			if (map.containsKey(key)) {
				value = map.get(key) + 1;
				map.put(key, value);
			} else {
				value = 1;
				map.put(key, value);
			}
		}
		// 遍历map
		for (Integer key1 : map.keySet()) {
			if (map.get(key1) > (array.length / 2)) {
				return key1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 测试数组
		int[] array = { 1, 2, 3, 2, 2, 2, 2, 2, 5, 4 };
		int num = MoreThanHalfNum_Solution(array);
		System.out.println("数组中出现次数超过数组长度一半的元素是：" + num);
	}
}
