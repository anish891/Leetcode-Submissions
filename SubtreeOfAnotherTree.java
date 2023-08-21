import javax.swing.tree.TreeNode;

public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;
        
        return isSameTree(root, subRoot) 
            || isSubtree(root.left, subRoot) 
            || isSubtree(root.right, subRoot);
    }
    
    private boolean isSameTree(TreeNode first, TreeNode second) {
        if (first == null && second == null) return true;
        if (first == null || second == null) return false;
        if (first.val != second.val) return false;
        return isSameTree(first.left, second.left) && isSubtree(first.right, second.right);
  }
}
