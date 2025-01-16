package q14071;
import java.util.Scanner;
class TreeNode {
	int val;
	TreeNode left, right;
	TreeNode(int x) {
		val = x;
		left = right = null;
	}
}
public class CTJ14071 {
	private int preIndex = 0;
	public TreeNode buildTree(int[] inorder, int[] preorder, int start, int end) {
		if (start > end) {
			return null;
		}
		TreeNode node = new TreeNode(preorder[preIndex++]);
		if (start == end) {
			return node;
		}
		int inorderIndex = findInorderIndex(inorder, start, end, node.val);
		node.left = buildTree(inorder, preorder, start, inorderIndex - 1);
		node.right = buildTree(inorder, preorder, inorderIndex + 1, end);
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
	public void postorderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.print(node.val + " ");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] inorder = new int[n];
		int[] preorder = new int[n];
		String[] inorderInput = scanner.nextLine().split(" ");
		String[] preorderInput = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			inorder[i] = Integer.parseInt(inorderInput[i]);
			preorder[i] = Integer.parseInt(preorderInput[i]);
		}
		CTJ14071 treeBuilder = new CTJ14071();
		TreeNode root = treeBuilder.buildTree(inorder, preorder, 0, n - 1);
		treeBuilder.postorderTraversal(root);
		scanner.close();
	}
}
