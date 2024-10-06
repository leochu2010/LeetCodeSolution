import java.util.ArrayList;
import java.util.List;

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

public class Solution637AverageOfLevelsInBinaryTree {
    public static void main(String[] args) {
        Solution637AverageOfLevelsInBinaryTree solution = new Solution637AverageOfLevelsInBinaryTree();

    }

    List<Double> sums = new ArrayList<Double>();
    List<Integer> nodes = new ArrayList<Integer>();

    public void visit(TreeNode node, int level) {
        if (node == null) return;
        if (level < sums.size()) {
            sums.set(level, sums.get(level) + ((Integer) node.val).doubleValue());
            nodes.set(level, nodes.get(level) + 1);
        } else {
            sums.add(((Integer) node.val).doubleValue());
            nodes.add(1);
        }
        visit(node.left, level + 1);
        visit(node.right, level + 1);
    }

    public List<Double> averageOfLevels(TreeNode root) {

        visit(root, 0);
        List<Double> avgs = new ArrayList<Double>();
        for (int i = 0; i < sums.size(); i++) {
            avgs.add(sums.get(i) / nodes.get(i));
        }
        return avgs;
    }

}
