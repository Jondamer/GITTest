package com.offerCollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

/**
 * 
 * @author zhengzhentao 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值.
 */
public class MaxInWindowsSolution {

	ArrayList<Integer> maxInWindows = new ArrayList<>();

	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		// 考虑异常情况
		if (num == null || num.length < size) {
			return maxInWindows;
		}
		if (size == 0) {
			return maxInWindows;
		}
		// 遍历数组，作为滑动窗口的输入。
		Queue<Integer> qWindow = new ArrayDeque<Integer>();
		for (int i = 0; i < num.length; i++) {

			qWindow.add(num[i]);
			if (qWindow.size() == size) {
				maxInWindows.add(Collections.max(qWindow));
			}
			if (qWindow.size() > size) {
				qWindow.poll(); // 超过3个就移除窗口中第一个进来的元素
				maxInWindows.add(Collections.max(qWindow));
			}

		}
		return maxInWindows;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxInWindowsSolution maxWin = new MaxInWindowsSolution();
		int[] nums = { 2, 3, 4, 2, 6, 2, 5, 1 };
		ArrayList<Integer> maxInWindows = maxWin.maxInWindows(nums, 3);

		for (Integer integer : maxInWindows) {
			System.out.println(integer);
		}
	}

}
