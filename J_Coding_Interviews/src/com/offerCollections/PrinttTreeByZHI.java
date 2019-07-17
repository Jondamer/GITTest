package com.offerCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的 顺序打印，其他行以此类推。
 * 输入（I）:二叉树根节点 输出（O）：按照之字形打印二叉树，每层保存到一个ArrayList中。
 * 
 * @author zhengzhentao
 *
 */
public class PrinttTreeByZHI {

	public PrinttTreeByZHI() {
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<ArrayList<Integer>> PrintTree(TreeNode pRoot) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (pRoot == null) {
			return result;
		}
		Queue<TreeNode> layer = new LinkedList<TreeNode>();
		ArrayList<Integer> layerList = new ArrayList<Integer>();
		layer.add(pRoot);
		int start = 0, end = 1;
		while (!layer.isEmpty()) {
			TreeNode cur = layer.remove();
			layerList.add(cur.val);
			start++;
			if (cur.left != null) {
				layer.add(cur.left);
			}
			if (cur.right != null) {
				layer.add(cur.right);
			}

			if (start == end) {
				end = layer.size();
				start = 0;
				reverseList(layerList); // 偶数层逆序排列
				result.add(layerList);
				layerList = new ArrayList<Integer>();
			}

		}
		// 对result中的结果进行逆序排列
		for (int i = 0; i < result.size(); i++) {
			if ((i & 1) == 0) { // 偶数层进行逆序排列
				ArrayList<Integer> temp = result.get(i);
				// 调用逆序的方法
				reverseList(temp);
			}
		}
		return result;
	}

	// Arraylist中的元素逆序排序

	public static void reverseList(ArrayList<Integer> al) {

		// 临时数组
		int temp[] = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			temp[i] = al.get(al.size() - 1 - i);
		}
		System.out.println("打印数组：");
		for (int i : temp) {
			System.out.print(i + "\t");
		}
		for (int j = 0; j < al.size(); j++) {
			al.set(j, temp[j]);
		}
		System.out.println("逆序后的链表：");
		// 逆序后的ArrayList
		for (Integer integer : al) {
			System.out.println(integer);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
