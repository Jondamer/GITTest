package com.offerCollections;


/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。 输入：二叉树的根节点 输出：布尔值。
 * 
 * @author zhengzhentao
 *
 */

public class IsSymmetricalBinaryTree {

	public IsSymmetricalBinaryTree() {
		// TODO Auto-generated constructor stub
	}

	static boolean isSymmetrical(TreeNode root) {
		boolean b = false;
		// 调用拷贝一颗二叉树的方法
		TreeNode temp = copyTree(root);
		// 调用求一棵树的镜像树的方法
		TreeNode pRoot2 = Mirror(root);
		// 调用比较两棵树相等的方法
		b = isSameBT(temp, pRoot2);
		return b;
	}

	// 声明一个 求一棵树的镜像树的方法
	public static TreeNode Mirror(TreeNode root) {
		if (root == null)
			return null;
		// 声明一个临时交换的节点
		TreeNode temp = root.left;
		// 交换每个节点的左右孩子
		root.left = root.right;
		root.right = temp;
		Mirror(root.left);
		Mirror(root.right);
		return root;
	}

	// 声明一个判断两棵树是不是相同的方法
	static boolean isSameBT(TreeNode root1, TreeNode root2) {
		// 第一种情况是：两棵树都是空，则两棵树相同
		if (root1 == null && root2 == null)
			return true;
		// 第二种情况：一棵树为空，另一颗不为空个，则两棵树一定不相同
		if ((root1 == null && root2 != null) || (root1 != null && root2 == null))
			return false;
		if (root1.val != root2.val)
			return false;
		// 第三种情况，两棵树都不为空
		return isSameBT(root1.left, root2.left) && isSameBT(root1.right, root2.right);

	}

	// 定义一个拷贝一颗二叉树的方法
	static TreeNode copyTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode t = new TreeNode(root.val);
		t.left = copyTree(root.left);
		t.right = copyTree(root.right);
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个树
		TreeNode root = new TreeNode(1);
		TreeNode A = new TreeNode(3);
		TreeNode B = new TreeNode(2);
		TreeNode A_L = new TreeNode(4);
		TreeNode A_R = new TreeNode(5);
		TreeNode B_L = new TreeNode(5);
		TreeNode B_R = new TreeNode(4);
		root.left = A;
		root.right = B;
		A.left = A_L;
		A.right = A_R;
		B.left = B_L;
		B.right = B_R;
		boolean b = isSymmetrical(root);
		System.out.println(" is the symmertrical tree:" + b);
	}

}
