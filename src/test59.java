/**
 * Created by Administrator on 2016/12/10.
 */
public class test59 {
    boolean isSymmetrical(TreeNode pRoot){
        if (pRoot==null) {
            return true;
        }
        return isSymmetrical(pRoot.left,pRoot.right);
    }
    public static boolean isSymmetrical(TreeNode left ,TreeNode right){
        if (left == null && right == null) {
            return true;
        }
        if ((left != null && right == null)||(left==null && right!=null)) {
            return false;
        }
        if (left.val!=right.val) {
            return false;
        }
        return isSymmetrical(left.left, right.right) && isSymmetrical(left.right, right.left);
    }
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
