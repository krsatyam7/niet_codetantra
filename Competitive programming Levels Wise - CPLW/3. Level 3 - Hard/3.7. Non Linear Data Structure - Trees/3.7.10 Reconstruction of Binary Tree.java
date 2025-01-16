package q14774;
import java.util.*;
class TreeNode {
	int val;
	TreeNode left, right;
	TreeNode(int x) {
		val = x;
		left = right = null;
	}
}
public class CTJ14774 {
	public static TreeNode buildTree(int[] inorder, int[] preorder, int inStart, int inEnd, int preStart, int preEnd) {
		if (inStart > inEnd || preStart > preEnd) {
			return null;
		}
		int rootVal = preorder[preStart];
		TreeNode root = new TreeNode(rootVal);
		int rootIndexInInorder = 0;
		for (int i = inStart; i <= inEnd; i++) {
			if (inorder[i] == rootVal) {
				rootIndexInInorder = i;
				break;
			}
		}
		int leftTreeSize = rootIndexInInorder - inStart;
		root.left = buildTree(inorder, preorder, inStart, rootIndexInInorder - 1, preStart + 1, preStart + leftTreeSize);
		root.right = buildTree(inorder, preorder, rootIndexInInorder + 1, inEnd, preStart + leftTreeSize + 1, preEnd);
		return root;
	}
	public static void postOrderTraversal(TreeNode root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.val + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] inorder = new int[N];
		for (int i = 0; i < N; i++) {
			inorder[i] = sc.nextInt();
		}
		int[] preorder = new int[N];
		for (int i = 0; i < N; i++) {
			preorder[i] = sc.nextInt();
		}
		TreeNode root = buildTree(inorder, preorder, 0, N - 1, 0, N - 1);
		postOrderTraversal(root);
	}
}
