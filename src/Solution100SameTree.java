class TreeNode {
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

public class Solution100SameTree {

    public static void main(String[] args) {
        Solution100SameTree solution = new Solution100SameTree();
        solution.isSameTree(null, null);
    }

    boolean sameNode(TreeNode p, TreeNode q) {
        if (p == null && q != null) return false;
        if (p != null && q == null) return false;
        if (p.val != q.val) return false;
        return true;
    }

    boolean sameNodes(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (!sameNode(p, q)) return false;
        if (!sameNodes(p.left, q.left)) return false;
        if (!sameNodes(p.right, q.right)) return false;
        return true;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // recursively visit both tree with bfs
        // if any node different return false
        return sameNodes(p, q);
    }
}
