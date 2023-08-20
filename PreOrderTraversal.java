import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
      preOrder(root, ans);
      return ans;
    }
    public void preOrder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}
