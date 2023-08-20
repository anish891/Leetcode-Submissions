import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class PostOrderTraversal {
    List<Integer> arr=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root!=null){
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        arr.add(root.val);
        }
        return arr;
    }
}
