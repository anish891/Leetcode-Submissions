import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {

        if (root == null)
            return 0;    
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                // Check if the current node is a leaf node
                if (currentNode.left == null && currentNode.right == null)
                    return depth;

                if (currentNode.left != null)
                    queue.offer(currentNode.left);

                if (currentNode.right != null)
                    queue.offer(currentNode.right);
            }
            depth++;
        }
        return depth;
    }
}
