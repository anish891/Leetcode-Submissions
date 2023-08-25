public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return checkSymmetry(root.left, root.right);
    }
    public boolean checkSymmetry(TreeNode leftN, TreeNode rightN){
        if(leftN == null && rightN == null){
            return true;
        }
        if(leftN == null || rightN == null){
            return false;
        }
        if(leftN.val != rightN.val){
            return false;
        }
        return checkSymmetry(leftN.left, rightN.right) && checkSymmetry(leftN.right, rightN.left);
    }
}
