package com.offerCollections;

/**
 * 求二叉树的深度
 * 
 * @author zhengzhentao
 *
 */
public class TreeDepthSolution {

	public TreeDepthSolution() {
		// TODO Auto-generated constructor stub
	}

	public static int TreeDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = TreeDepth(root.left);
		int rightDepth = TreeDepth(root.right);
		return Math.max(leftDepth, rightDepth) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /**  
	     *                  1 
	     *                 / \ 
	     *                2    3 
	     *               /    /   
	     *              4    5
	     *             
	     *           
	     */  
		TreeNode root =new TreeNode(1);
		TreeNode A =new TreeNode(2);
		TreeNode B =new TreeNode(3);
		TreeNode A_left =new TreeNode(4);
		TreeNode B_left =new TreeNode(5);
		root.left=A;
		root.right=B;
		A.left=A_left;
		B.left=B_left;
//		测试
		int treeDepth=TreeDepth(root);
		System.out.println("二叉树的高度是："+treeDepth);
	}

}
