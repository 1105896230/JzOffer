/**
 * Created by Administrator on 2016/12/10.
 */
public class test57 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null)return null;

        ListNode preNode = null;
        ListNode node = pHead;
        while(node!=null){
            ListNode nextNode = node.next;
            boolean needDelete = false;
            if(nextNode!=null&&nextNode.val==node.val){
                needDelete = true;
            }
            if(!needDelete){
                preNode = node;
                node = node.next;
            }
            else{
                int value = node.val;
                ListNode toBeDel = node;
                while(toBeDel!=null&&toBeDel.val == value){
                    nextNode = toBeDel.next;
                    toBeDel = nextNode;
                    if(preNode==null)
                        pHead = nextNode;
                    else
                        preNode.next = nextNode;
                    node = nextNode;
                }
            }
        }

        return pHead;
    }
}
