public class Solution114FlattenBinaryTreeToLinkedList {

    public static void main(String[] args) {

    }

    TreeNode parent = null;

    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = parent;
        root.left = null;
        parent = root;
    }
}
