package q9428;
import java.util.*;
import java.util.stream.*;
class TreeNode {
	int value;
	TreeNode left, right;
	TreeNode (int val) {
		value = val;
		left = right = null;
	}
}
public class CTJ9428 {
	private static TreeNode root;
	public static String findLevel(int N, List<Integer> Arr, int K) {
		root = null;
		for (int value : Arr) {
			root = insert(root, value);
		}
		int level = findLevel(root, K, 1);
		return level == -1 ? "Not found" : String.valueOf(level);
	}
	private static TreeNode insert(TreeNode root, int value) {
		if (root == null) {
		 return new TreeNode(value);
		}
		if (value < root.value) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;
	}
	private static int findLevel(TreeNode node, int K, int level) {
		if (node == null) {
			return -1;
		}
		if (node.value == K) {
			return level;
		}
		int leftLevel = findLevel(node.left, K, level + 1);
		if (leftLevel != -1) {
			return leftLevel;
		}
		return findLevel(node.right, K, level + 1);
	}
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		List<Integer> Arr = Arrays.stream(args[1].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		int K = Integer.parseInt(args[2]);
		System.out.println(findLevel(N, Arr, K));
	}
}
