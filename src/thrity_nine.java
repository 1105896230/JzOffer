/**
 * Created by Administrator on 2016/12/7.
 */
public class thrity_nine {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int nLeft=TreeDepth(root.left);
        int nRight=TreeDepth(root.right);
        return (nLeft>nRight)?(nLeft+1):(nRight+1);
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        int nLeft=TreeDepth(root.left);
        int nRight=TreeDepth(root.right);
        int diff=nLeft-nRight;
        if(diff>1||diff<-1){
            return false;
        }
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }
}
