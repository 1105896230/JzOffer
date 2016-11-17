/**
 * Created by FMT on 2016/11/17.
 */
//合并两个排序链表
public class seventeen {

    private ListNode merge(ListNode pHead1,ListNode pHead2){
        if (pHead1==null){
            return pHead2;
        }
        if (pHead2==null){
            return pHead1;
        }
        ListNode pMergedHead=null;
        if (pHead1.getValue()<pHead2.getValue()){
            pMergedHead=pHead1;
            pMergedHead.setNext(merge(pHead1.getNext(),pHead2));
        }else {
            pMergedHead=pHead2;
            pMergedHead.setNext(merge(pHead1,pHead2.getNext()));
        }
        return pMergedHead;
    }
}
