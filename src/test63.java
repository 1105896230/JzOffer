/**
 * Created by Administrator on 2016/12/11.
 */
public class test63 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    int count = 0;  // 遍历计数
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot == null || k <= 0)
            return null;

        TreeNode target = null;
        if(pRoot.left != null)      // 遍历左子树
            target = KthNode(pRoot.left, k);

        count++;    // 计数加1
        if(target == null) {
            if(count == k) {    // 如果计数等于k，则找到pRoot
                target = pRoot;
                return target;
            }
        }

        if(target == null && pRoot.right != null)   // 遍历右子树
            target = KthNode(pRoot.right, k);

        return target;
    }
}
