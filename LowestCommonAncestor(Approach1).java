public class LowestCommonAncestor(Approach1) {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        getPath(root, p, path1);
        getPath(root, q, path2);

        // last common ancestor
        int i =0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        // last equal node -> (i-1)th
        
        TreeNode lca = path1.get(i-1);

        return lca;
    }
    public static boolean getPath(TreeNode root, TreeNode n, ArrayList<TreeNode> path){
        if(root == null){
            return false;
        }

        path.add(root);

        if(root.val == n.val){
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }

        path.remove(path.size()-1);

        return false;
    }
}
