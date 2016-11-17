/**
 * Created by FMT on 2016/11/16.
 */
public class fiveteen {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2= new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);
        listNode4.setNext(listNode5);
        ListNode toTail = findToTail(listNode1,5);
        System.out.print(toTail.getValue());
    }

//    public ListNode findToTail(ListNode node,int k){
//        ListNode first=node;
//        ListNode tagNode=null;
//        for (int i=0;i<k-1;i++){
//            first=node.getNext();
//        }
//        tagNode=node;
//        while (first.getNext()!=null){
//            first=first.getNext();
//            tagNode=tagNode.getNext();
//        }
//        return tagNode;
//    }

    public static ListNode findToTail(ListNode node, int k) {
        if (node == null || k == 0) return null;
        ListNode first = node;
        ListNode tagNode = null;
        for (int i = 0; i < k - 1; i++) {
            if (first.getNext() != null)
                first = first.getNext();
            else
                return null;
        }
        tagNode = node;
        while (first.getNext() != null) {
            first = first.getNext();
            tagNode = tagNode.getNext();
        }
        return tagNode;
    }
}
    