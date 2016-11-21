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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
/**
 * Created by Administrator on 2016/11/22.
 * email 1105896230@qq.com
 */
//二叉树中和为某一值的路径
public class twenty_five {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null){
            return new ArrayList();
        }
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        int current = 0 ;
        Stack<Integer> path = new Stack<Integer>();
        // ArrayList<Integer> array = new ArrayList<Integer>();
        FindPath(root , target , path , current , array);
        return array;
    }
    void FindPath(TreeNode root , int target ,Stack<Integer> path ,  int current ,ArrayList<ArrayList<Integer>> array){
        current += root.val;
        path.push(root.val);
        boolean isLeaf =  (( root.left == null) && ( root.right == null));
        if(current == target && isLeaf){
            array.add(new ArrayList<Integer>(path));
        }
        if(root.left != null){
            FindPath(root.left , target , path , current, array);
        }
        if(root.right != null){
            FindPath(root.right , target , path , current , array);
        }
        current -=root.val;
        path.pop();
    }
}
