import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Administrator on 2016/12/10.
 */
public class test61 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> >  al=new ArrayList<ArrayList<Integer> > ();
        if(pRoot==null){
            return al;
        }
        Stack<TreeNode> dan=new Stack<TreeNode>();
        Stack <TreeNode> shuang=new Stack<TreeNode>();
        dan.push(pRoot);
        while(dan.size()!=0||shuang.size()!=0){
            ArrayList<Integer> te=new ArrayList<Integer>();
            if(dan.size()!=0){
                while(dan.size()!=0){
                    TreeNode tn=dan.pop();
                    te.add(tn.val);
                    if(tn.left!=null)shuang.push(tn.left);
                    if(tn.right!=null)shuang.push(tn.right);
                }
            }else if(shuang.size()!=0){
                while(shuang.size()!=0){
                    TreeNode tn=shuang.pop();
                    te.add(tn.val);
                    if(tn.right!=null)dan.push(tn.right);
                    if(tn.left!=null)dan.push(tn.left);
                }
            }
            al.add(te);
        }
        return al;

    }
}
