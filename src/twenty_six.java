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

/**
 * Created by Administrator on 2016/11/23.
 * email 1105896230@qq.com
 */
//复杂链表的复制
public class twenty_six {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;
        RandomListNode(int label) {
            this.label = label;
        }
    }
    void CloneNode(RandomListNode head){
        RandomListNode node=head;
        while (node!=null){
            RandomListNode complexListNode = new RandomListNode(node.label);
            complexListNode.label=node.label;
            complexListNode.next=node.next;
            complexListNode.random=node.random;
            node.next=complexListNode;
            node=complexListNode.next;
        }
    }
    void connectSibingNodes(RandomListNode head){
        RandomListNode node=head;
        while (node!=null){
            RandomListNode pClone=node.next;
            if (node.random!=null){
                pClone.random=node.random.next;
            }
            node=pClone.next;
        }
    }
    RandomListNode ReconnectNodes(RandomListNode head){
        RandomListNode pnode=head;
        RandomListNode pCloneHead=null;
        RandomListNode pCloneNode=null;
        if (pnode!=null){
            pCloneHead=pCloneNode=pnode.next;
            pnode.next=pCloneNode.next;
            pnode=pnode.next;
        }
        if (pnode!=null){
            pCloneNode.next=pnode.next;
            pCloneNode=pCloneNode.next;
            pnode.next=pCloneNode.next;
            pnode=pnode.next;
        }
        return pCloneHead;
    }

}
