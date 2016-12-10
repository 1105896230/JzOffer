/**
 * Created by Administrator on 2016/12/10.
 */
public class test56 {
    private static class ListNode {
        private int val;
        private ListNode next;
        public ListNode() {
        }
        public ListNode(int val) {
            this.val = val;
        }
        @Override
        public String toString() {
            return val +"";
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null)
            return null;
        ListNode node=MeetingNode(pHead);
        if(node==null)
            return null;
        ListNode temp=node.next;
        int n=1;
        while(temp!=node){
            n++;
            temp=temp.next;
        }
        ListNode p=pHead;
        ListNode q=pHead;
        for(int i=0;i<n;i++){
            q=q.next;
        }
        while(p!=q){
            p=p.next;
            q=q.next;
        }
        return p;
    }
    private ListNode MeetingNode(ListNode pHead){
        if(pHead==null)
            return null;
        ListNode pSlow=pHead.next;
        if(pSlow==null)
            return null;
        ListNode pFast=pSlow.next;
        while(pFast!=null&&pSlow!=null){
            if(pFast==pSlow)
                return pFast;
            pSlow=pSlow.next;
            pFast=pFast.next;
            if(pFast!=null)
                pFast=pFast.next;
        }
        return null;
    }
}
