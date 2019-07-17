package com.offerCollections;

import java.util.ArrayList;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 
 * @author zhengzhentao
 *
 */
public class HasSubTreeSolution {

	public HasSubTreeSolution() {
		// TODO Auto-generated constructor stub
	}

	public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		// 当Tree1和Tree2都不为零的时候，才进行比较。否则直接返回false
		if (root2 != null && root1 != null) {
			// 如果找到了对应Tree2的根节点的点
			if (root1.val == root2.val) {
				// 以这个根节点为为起点判断是否包含Tree2
				result = doesTree1HaveTree2(root1, root2);
			}
			// 如果找不到，那么就再去root的左儿子当作起点，去判断时候包含Tree2
			if (!result) {
				result = HasSubtree(root1.left, root2);
			}

			// 如果还找不到，那么就再去root的右儿子当作起点，去判断时候包含Tree2
			if (!result) {
				result = HasSubtree(root1.right, root2);
			}
		}
		// 返回结果
		return result;
	}

	public static boolean doesTree1HaveTree2(TreeNode node1, TreeNode node2) {
		// 如果Tree2已经遍历完了都能对应的上，返回true
		if (node2 == null) {
			return true;
		}
		// 如果Tree2还没有遍历完，Tree1却遍历完了。返回false
		if (node1 == null) {
			return false;
		}
		// 如果其中有一个点没有对应上，返回false
		if (node1.val != node2.val) {
			return false;
		}

		// 如果根节点对应的上，那么就分别去子节点里面匹配
		return doesTree1HaveTree2(node1.left, node2.left) && doesTree1HaveTree2(node1.right, node2.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个树
		TreeNode root = new TreeNode(1);
		TreeNode A = new TreeNode(3);
		TreeNode B = new TreeNode(4);
		TreeNode A_L = new TreeNode(5);
		TreeNode A_R = new TreeNode(6);
		TreeNode B_L = new TreeNode(7);
		TreeNode B_R = new TreeNode(8);
		root.left = A;
		root.right = B;
		A.left = A_L;
		A.right = A_R;
		B.left = B_L;
		B.right = B_R;

		// 再次创建一颗树 root2
		TreeNode root2 = new TreeNode(1);
		TreeNode A2 = new TreeNode(3);
		TreeNode B2 = new TreeNode(4);
		TreeNode A2_L = new TreeNode(5);
		TreeNode A2_R = new TreeNode(6);
		TreeNode B2_L = new TreeNode(7);
		TreeNode B2_R = new TreeNode(9);

		root2.left = A2;
		root2.right = B2;
		A2.left = A2_L;
		A2.right = A2_R;
		B2.left = B2_L;
		B2.right = B2_R;

		boolean b = HasSubtree(root, root2);
		System.out.println(b);

	}

}
