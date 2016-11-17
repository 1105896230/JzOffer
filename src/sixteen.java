/**
 * Created by FMT on 2016/11/17.
 */
//反转链表
public class sixteen {

    public ListNode reverList(ListNode pHead){
        ListNode  pReversedHead=null;
        ListNode pNode=pHead;
        ListNode pPrev=null;
        while (pNode!=null){
            ListNode pNext=pNode.getNext();
            if (pNext==null)
                pReversedHead=pNode;
            pNode.setNext(pPrev);
            pPrev=pNode;
            pNode=pNext;
        }
    }
}
