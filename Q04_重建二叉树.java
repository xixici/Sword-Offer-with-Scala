package Offer;

public class Q04_重建二叉树 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		return reConBTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	public TreeNode reConBTree(int[] pre, int preleft, int preright, int[] in, int inleft, int inright) {
		if (preleft > preright || inleft > inright)// 当到达边界条件时候返回null
			return null;
		// 新建一个TreeNode
		TreeNode root = new TreeNode(pre[preleft]);
		// 对中序数组进行输入边界的遍历
		for (int i = inleft; i <= inright; i++) {
			if (pre[preleft] == in[i]) {
				// 重构左子树，注意边界条件
				root.left = reConBTree(pre, preleft + 1, preleft + i - inleft, in, inleft, i - 1);
				// 重构右子树，注意边界条件
				root.right = reConBTree(pre, preleft + i + 1 - inleft, preright, in, i + 1, inright);
			}
		}
		return root;
	}
}
