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

    boolean isBalance(TreeNode root,int pDepth){
        if (root==null){
            pDepth=0;
            return true;
        }
        int left=0;
        int right=0;
        if (isBalance(root.left,left)&&isBalance(root.right,right)){
            int diff=left-right;
            if (diff<=1&&diff>=-1){
                pDepth=1+(left>right?left:right);
                return true;
            }
        }
        return false;
    }

    boolean isBalanced(TreeNode node){
        int depth=0;
        return isBalance(node,depth);
    }
}
