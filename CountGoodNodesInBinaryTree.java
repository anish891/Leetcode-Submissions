public class CountGoodNodesInBinaryTree {
        int count = 0;
        public int goodNodes(TreeNode root) {
            traverse(root, Integer.MIN_VALUE);
            return count;
        }
        public void traverse(TreeNode root, int max){
            if(root == null) return;
            if(root.val >= max){
                max = root.val;
                count++;
            }
            traverse(root.left, max);
            traverse(root.right, max);
        }
}
