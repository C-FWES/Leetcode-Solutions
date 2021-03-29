
import java.util.IllegalFormatCodePointException;

public class PathSum {
    public static class TreeNode {
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
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (targetSum - root.val == 0) {
                return true;
            }
        }

        boolean found = hasPathSum(root.left, targetSum - root.val);
        if (found) {
            return true;
        }
        else {
            return hasPathSum(root.right, targetSum - root.val);
        }
    }
}
