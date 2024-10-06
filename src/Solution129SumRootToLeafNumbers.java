public class Solution129SumRootToLeafNumbers {

    public static void main(String[] args) {

    }

    int sum = 0;

    void sumPaths(TreeNode node, String path) {
        if (node == null) return;
        String newPath = path + node.val;
        if (node.left != null) {
            sumPaths(node.left, newPath);
        }
        if (node.right != null) {
            sumPaths(node.right, newPath);
        }
        if (node.left == null && node.right == null) {
            sum += Integer.valueOf(newPath);
        }
    }

    public int sumNumbers(TreeNode root) {
        sumPaths(root, "");
        return sum;
    }
}
