package q14775;
import java.util.*;
class TreeNode {
	int val;
	TreeNode left, right;
	TreeNode(int x) {
		val = x;
		left = right = null;
	}
}
public class CTJ14775 {
	private int postIndex;
	public TreeNode buildTree(int[] inorder, int[] postorder, int start, int end) {
		if (start > end) {
			return null;
		}
		TreeNode node = new TreeNode(postorder[postIndex--]);
		if (start == end) {
			return node;
		}
		int inorderIndex = findInorderIndex(inorder, start, end, node.val);
		node.right = buildTree(inorder, postorder, inorderIndex + 1, end);
		node.left = buildTree(inorder, postorder, start, inorderIndex - 1);
		return node;
	}
	private int findInorderIndex(int[] inorder, int start, int end, int value) {
		for (int i = start; i <= end; i++) {
			if (inorder[i] == value) {
				return i;
			}
		}
		return -1;
	}
	public void preorderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		preorderTraversal(node.left);
		preorderTraversal(node.right);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] inorder = new int[n];
		int[] postorder = new int[n];
		String[] inorderInput = scanner.nextLine().split(" ");
		String[] postorderInput = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			inorder[i] = Integer.parseInt(inorderInput[i]);
			postorder[i] = Integer.parseInt(postorderInput[i]);
		}
		CTJ14775 treeBuilder = new CTJ14775();
		treeBuilder.postIndex = n - 1;
		TreeNode root = treeBuilder.buildTree(inorder, postorder, 0, n - 1);
		treeBuilder.preorderTraversal(root);
		scanner.close();
	}
}
