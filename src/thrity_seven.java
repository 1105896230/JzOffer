/**
 * Created by Administrator on 2016/12/5.
 */
public class thrity_seven {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
          int length1=getNodeLength(pHead1);
        int length2=getNodeLength(pHead2);
        int lengthDif=length1-length2;
        ListNode pListHeadLong=pHead1;
        ListNode pListHeadShort=pHead2;
        if (length2>length1){
            pListHeadLong=pHead2;
            pListHeadShort=pHead1;
            lengthDif=length2-length1;
        }
        for (int i=0;i<lengthDif;i++){
            pListHeadLong=pListHeadLong.next;
        }
        while (pListHeadLong!=null&&pListHeadShort!=null&&(pListHeadLong!=pListHeadShort)){
            pListHeadLong=pListHeadLong.next;
            pListHeadShort=pListHeadShort.next;
        }
        ListNode pFirtsNode=pListHeadLong;
        return pFirtsNode;
    }
    int getNodeLength(ListNode phead){
        int nLength=0;
        ListNode p=phead;
        while (p!=null){
            ++nLength;
            p=p.next;
        }
        return nLength;
    }
}
