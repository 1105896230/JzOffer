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

import java.util.Arrays;

/**
 * Created by Administrator on 2016/11/22.
 * email 1105896230@qq.com
 */
//二叉树后序遍历
public class twenty_four {
    boolean verifySquenceofBst(int[] sequence){
        int length=sequence.length;
        if (sequence==null||length<=0){
            return false;
        }
        int root=sequence[length-1];
        //在二叉树搜索树中左子树的结点小于根结点
        int i=0;
        for (;i<length-1;i++){
            if (sequence[i]>root)
                break;
        }
        //在二叉树搜索中右子树的结点大于根结点
        int j=i;
        for (;j<length-1;j++){
            if (sequence[j]<root)
                return false;
        }
        boolean left=true;
        if (i>0){
            left=verifySquenceofBst(Arrays.copyOfRange(sequence, 0, i));
        }
        boolean right=true;
        if (i<length-1)
            right=verifySquenceofBst(Arrays.copyOfRange(sequence, i, sequence.length-1));
        return (left&&right);
    }
}
