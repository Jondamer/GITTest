package com.offerCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
 * 
 * @author zhengzhentao num1,num2分别为长度为1的数组。传出参数/将num1[0],num2[0]设置为返回结果
 */
public class FindNumsAppearOnceSolution {

	public FindNumsAppearOnceSolution() {
		// TODO Auto-generated constructor stub
	}

	public static void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int value = 1;
		int key;
		for (int i = 0; i < array.length; i++) {
			key = array[i];
			if (hm.containsKey(key)) {
				value = hm.get(key) + 1;
				hm.put(key, value);
			} else {
				value = 1;
				hm.put(key, value);
			}
		}
		ArrayList<Integer> al = new ArrayList<>();
		// 遍历HashMap
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				al.add(entry.getKey());
			}
			// System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		num1[0] = al.get(0);
		num2[0] = al.get(1);
		System.out.println(num1[0] +" \t"+ num2[0]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 1, 2, 3, 3, 4, 5, 5 };
		int[] n1 = { 0 };
		int[] n2 = { 0 };

		FindNumsAppearOnce(array, n1, n2);
	}

}
