/**
 * Created by FMT on 2016/11/17.
 */
//输入两个二叉树，判断B是不是A的子结构
public class eighteen {
    boolean HasSubtree(BinaryTreeNode pRoot1,BinaryTreeNode pRoot2){
        boolean result=false;

        if (pRoot1!=null&&pRoot2!=null){
            if (pRoot1.getValue()==pRoot2.getValue()){
                result=DoesTree1HaveTree2(pRoot1,pRoot2);
            }
            if (!result){
                result=HasSubtree(pRoot1.getLeft(),pRoot2);
            }
            if (!result){
                result=HasSubtree(pRoot1.getRight(),pRoot2);
            }
        }
        return result;
    }
    boolean DoesTree1HaveTree2(BinaryTreeNode pRoot1,BinaryTreeNode pRoot2){
        if (pRoot2==null)return true;
        if (pRoot1==null)return false;
        if (pRoot1.getValue()!=pRoot2.getValue())return false;
        return DoesTree1HaveTree2(pRoot1.getLeft(),pRoot2.getLeft())&&DoesTree1HaveTree2(pRoot1.getRight(),pRoot2.getRight());
    }
}
