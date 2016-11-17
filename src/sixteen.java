/**
 * Created by FMT on 2016/11/17.
 */
//反转链表
public class sixteen {

    public ListNode reverList(ListNode pHead){
        ListNode  pReversedHead=null;
        ListNode pNode=pHead;
        ListNode pPrev=null;//前一个节点
        while (pNode!=null){
            ListNode pNext=pNode.getNext();
            if (pNext==null)
                pReversedHead=pNode;
            pNode.setNext(pPrev);//让当前结点设置前一个结点
            pPrev=pNode;//让当前结点设置为前一个结点
            pNode=pNext;//当前结点设置为下一个结点
        }
        return pReversedHead;
    }
}
