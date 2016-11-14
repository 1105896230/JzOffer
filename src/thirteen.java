//                            _ooOoo_
//                           o8888888o  
//                           88" . "88  
//                           (| -_- |)  
//                            O\ = /O  
//                        ____/`---'\____  
//                      .   ' \\| |// `.  
//                       / \\||| : |||// \  
//                     / _||||| -:- |||||- \  
//                       | | \\\ - /// | |  
//                     | \_| ''\---/'' | |  
//                      \ .-\__ `-` ___/-. /  
//                   ___`. .' /--.--\ `. . __  
//                ."" '< `.___\_<|>_/___.' >'"".  
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |  
//                 \ \ `-. \_ __\ /__ _/ .-` / /  
//         ======`-.____`-.___\_____/___.-`____.-'======  
//                            `=---='  
//  
//         .............................................  
//                  佛祖保佑             永无BUG  

//          佛曰:    
//                  写字楼里写字间，写字间里程序员；    
//                  程序人员写程序，又拿程序换酒钱。    
//                  酒醒只在网上坐，酒醉还来网下眠；    
//                  酒醉酒醒日复日，网上网下年复年。    
//                  但愿老死电脑间，不愿鞠躬老板前；    
//                  奔驰宝马贵者趣，公交自行程序员。    
//                  别人笑我忒疯癫，我笑自己命太贱；    
//                  不见满街漂亮妹，哪个归得程序员？   
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
/**
 * Created by Administrator on 2016/11/10.
 * email 1105896230@qq.com
 */

/**
 * O(1)时间内删除单向链表中的一个节点
 * 给定单向链表的头指针和一个结点指针，定义一个函数在O（1）时间删除该结点
 */
public class thirteen {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        delete(head,node2);
        printListNode(head);

    }
    public static void delete(ListNode head,ListNode target){
        if(head==null||target==null){
            return;
        }
        if(head.getNext()==null){
            if(head==target){
                head=null;
            }else{
                return;
            }
        }
        if(target.getNext()==null){
            ListNode currentNode = head;

            while(currentNode.getNext()!=null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
        }
        if(target.getNext()!=null){
            target.setValue(target.getNext().getValue());
            if(target.getNext().getNext()!=null){
                target.setNext(target.getNext().getNext());
            }else{
                target.setNext(null);
            }
        }
    }
    public static void printListNode(ListNode head){
        ListNode current = head;
        while(current!=null){
            System.out.println(current.getValue()+"...");
            current = current.getNext();
        }
    }

}
