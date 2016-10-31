//                  /+++=))    ((=+++\
//             /++++++++//      \\+++++++++\
 /*
                           _ooOoo_
                          o8888888o
                          88" . "88
                          (| -_- |)
                          O\  =  /O
                       ____/`---'\____
                     .'  \\|     |//  `.
                    /  \\|||  :  |||//  \
                   /  _||||| -:- |||||-  \
                   |   | \\\  -  /// |   |
                   | \_|  ''\---/''  |   |
                   \  .-\__  `-`  ___/-. /
                 ___`. .'  /--.--\  `. . __
              ."" '<  `.___\_<|>_/___.'  >'"".
             | | :  `- \`.;`\ _ /`;.`/ - ` : | |
             \  \ `-.   \_ __\ /__ _/   .-` /  /
        ======`-.____`-.___\_____/___.-`____.-'======
                           `=---='
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                 佛祖保佑       永无BUG
        */

/**
 * Created by "林其望".
 * DATE: 2016:10:26:19:38
 * email:1105896230@qq.com
 */
public class BinaryTreeNode {
    private int value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    public BinaryTreeNode(int value){
        this.value = value;
    }
    public BinaryTreeNode(int value,BinaryTreeNode left,BinaryTreeNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public int getValue( ){
        return this.value;
    }
    public void setValue(BinaryTreeNode node){
        this.value = value;
    }
    public void  setLeft(BinaryTreeNode node){
        this.left = node;
    }
    public void  setRight(BinaryTreeNode node){
        this.right = node;
    }
    public BinaryTreeNode getLeft( ){
        return this.left;
    }
    public BinaryTreeNode getRight( ){
        return this.right;
    }
}
