package q13408;
import java.util.*;
class TreeNode {
	int val;
	TreeNode left, right;
	TreeNode(int x) {
		val = x;
		left = right = null;
	}
}
public class CTJ13408 {
	static TreeNode insert(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}
		if (val < root.val) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}
		return root;
	}
	static List<Integer> reverseLevelOrder(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			result.add(0, node.val);
			if (node.right != null) {
				queue.add(node.right);
			}
			if (node.left != null) {
				queue.add(node.left);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		TreeNode root = null;
		for (int i = 0; i < N; i++) {
			int val = sc.nextInt();
			root = insert(root, val);
		}
		List<Integer> result = reverseLevelOrder(root);
		System.out.println(String.join(" ", result.stream().map(String::valueOf).toArray(String[]::new)));
	}
}
