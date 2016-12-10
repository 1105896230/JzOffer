/**
 * Created by Administrator on 2016/12/10.
 */
public class test58 {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {

        if(pNode == null){
            return null;
        }
        if(pNode.right != null){
            pNode = pNode.right;
            while(pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }
        while(pNode.next != null){ //非根节点
            if(pNode == pNode.next.left)
                return pNode.next;
            pNode = pNode.next;
        }
        return null;
    }
}