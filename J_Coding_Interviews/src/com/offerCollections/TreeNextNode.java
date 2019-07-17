package com.offerCollections;

/**
 * 二叉树的中序遍历
 * 
 * @author zhengzhentao
 *
 */

class TreeLinkNode {
	int val;
	TreeLinkNode left = null;
	TreeLinkNode right = null;
	TreeLinkNode next = null;

	TreeLinkNode(int val) {
		this.val = val;
	}
}

public class TreeNextNode {

	public TreeNextNode() {
		// TODO Auto-generated constructor stub
	}

	// 前序遍历---递归版本
	static void preOrder(TreeLinkNode root) {
		if (root != null) {
			System.out.println(root.val);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	// 中序遍历--递归版本

	static TreeLinkNode inOrder(TreeLinkNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.val);
			TreeLinkNode tempNode = root;
			inOrder(root.right);
			if (tempNode != null)
				System.out.println("hhhhhhh" + tempNode.val);
			return tempNode;
		}
		return root;
	}

	// 后序遍历--递归版本

	static void postOrder(TreeLinkNode root) {
		if (root != null) {
			postOrder(root.right);
			postOrder(root.left);
			System.out.println(root.val);
		}

	}

	public TreeLinkNode GetNext(TreeLinkNode pNode) {

		inOrder(pNode);
		return pNode;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个树
		TreeLinkNode root = new TreeLinkNode(1);
		TreeLinkNode A = new TreeLinkNode(2);
		TreeLinkNode B = new TreeLinkNode(3);
		TreeLinkNode A_L = new TreeLinkNode(4);
		TreeLinkNode A_R = new TreeLinkNode(5);
		TreeLinkNode B_L = new TreeLinkNode(6);
		root.left = A;
		root.right = B;
		A.left = A_L;
		A.right = A_R;
		B.left = B_L;
		// 调用前序遍历的方法
		// preOrder(root);
		// 调用中序遍历的方法
		// inOrder(root);
		// 调用后序遍历的方法
		postOrder(root);
		// 测试方法
		inOrder(root);

	}

}
