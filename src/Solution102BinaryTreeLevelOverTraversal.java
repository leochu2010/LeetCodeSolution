import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution102BinaryTreeLevelOverTraversal {

    Map<Integer, List<Integer>> levelNodesMap = new HashMap<>();

    void traverse(TreeNode node, int level) {
        if (node == null) return;
        List<Integer> levelNodes = levelNodesMap.getOrDefault(level, new ArrayList<Integer>());
        levelNodes.add(node.val);
        levelNodesMap.put(level, levelNodes);
        traverse(node.left, level + 1);
        traverse(node.right, level + 1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        traverse(root, 0);
        return new ArrayList<>(levelNodesMap.values());
    }
}
