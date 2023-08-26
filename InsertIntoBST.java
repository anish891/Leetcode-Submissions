import javax.swing.tree.TreeNode;

public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;
        }

        if(root.val > val){
            // left Subtree
            root.left = insertIntoBST(root.left, val);
        }

        if(root.val < val){
            // right Subtree
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

}
