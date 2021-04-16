import java.util.*;

public class BinaryTreeLevelOrderTraversalII {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static void main(String[] args) {

    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> traversed = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return traversed;
        }
        queue.add(root);
        while (queue.size() > 0) {
            List<Integer> levelList = new ArrayList<>();
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                levelList.add(current.val);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            traversed.addFirst(levelList);
        }
        return traversed;
    }
}
