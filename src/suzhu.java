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

import java.util.Stack;

/**
 * Created by "林其望".
 * DATE: 2016:10:20:21:02
 * email:1105896230@qq.com
 */
public class suzhu {

    public static void main(String[] args) {
        test();
    }

    //http://blog.csdn.net/sunmenggmail/article/details/7668387
    //http://www.cnblogs.com/zhuyf87/archive/2013/03/01/2938013.html
    //在一个二维整数数组中，每一行都按照从左到右递增的顺序排序，
    // 每一列都按照从上到下递增的顺序排序。请完成一个函数，
    // 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
    //解决思路
    // 从二维数组的右上角的元素开始判断，因为此元素是它所在行的最大数，是它所在的列的最小数。如果它等于要查找的数字，则查找过程结束。如果它大于要查找的数字，则可以排除它所在的列。如果它小于要查找的数字，则可排除它所在的行。这样如果要查找的数字不在数组的右上角，
    // 则每次判断都可以排除一行或一列以缩小查找范围，直到找到要查找的数字，或者查找范围为空。
    private static void suzhu1() {
        int[][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int target = 16;
        int rows = arr.length;
        int columns = arr[0].length;
        int row = 0;
        int column = columns - 1;

        while (row <= rows && column >= 0) {
            if (target == arr[row][column]) {
                System.out.println(target + "在第" + row + "行，第" + column + "列");
                break;
            }
            if (target > arr[row][column]) {
                row++;
                if (row>=rows)break;
            }
            if (target < arr[row][column]) {
                column--;
            }
        }
    }

    /**
     * 请实现一个函数，将一个字符串中的空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     * 如果从前往后走，每次替换一个空格，后面的字符串均要往后诺两位
     * 假设字符串的长度为n，对每个空格字符串，需要挪动后面O(n)字符串，因此对含有O（n）个空格字符的字符串而言总的时间效率是O(n^2)
     * 结题思路是 从字符串的后面往前替换（时间复杂度是O(n)，可以先遍历一个字符串，这样就能统计字符串中空格的总数，可以计算替换之后字符串的总数。每替换一个空格，长度增加了2
     * 因此替换以后字符串的长度等于原来的长度加上2乘以空格数。
     */
    public static void test() {

        String str = "We Are Happy";
        char[] charOld = str.trim().toCharArray();
        char[] charNew = new char[100];
        for (int j = 0; j < charOld.length; j++) {
            charNew[j] = charOld[j];
        }
        int blank = 0;
        for (int i = 0; i < charNew.length; i++) {
            if (charNew[i] == ' ') {
                blank++;
            }
        }
        int lengthFront = charOld.length - 1;

        int lengthBack = charOld.length + 2 * blank-1;

        while (lengthFront >= 0 && lengthBack > lengthFront) {
            if (charNew[lengthFront] != ' ') {
                charNew[lengthBack--] = charNew[lengthFront];
            } else {
                charNew[lengthBack--] = '0';
                charNew[lengthBack--] = '2';
                charNew[lengthBack--] = '%';
            }
            lengthFront--;
        }
        System.out.println(charNew);
    }

    //从尾到头打印链表
    public static void test1(ListNode node) {
//        Stack mStack = new Stack<>();
//        while (node != null) {
//            mStack.push(node);
//            node = node.getNext();
//        }
//        while (!mStack.empty()) {
//            System.out.print(mStack.pop());
//        }
    }

    //递归解决
    public static void test2(ListNode node) {
        if (node != null) {
            if (node.getNext() != null) {
                test2(node);
            }
            System.out.print(node);
        }
    }

    //重建二叉树
    //已知前序找根结点，然后判断跟结点在中序输出中的位置，根节点左边的就是左子树，右边就是有字数
    //递归查找
    public static void test4() {
        int[] frontOrder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        BinaryTreeNode root = BinaryTree(frontOrder, inOrder);
        printPostOrder(root);
    }

    public static void printPostOrder(BinaryTreeNode root) {
        if (root != null) {
            printPostOrder(root.getLeft());
            printPostOrder(root.getRight());
            System.out.println(root.getValue());
        }
    }

    public static BinaryTreeNode BinaryTree(int[] frontOrder, int[] inOrder) {
        //根据前序结点获取当前的跟结点
        BinaryTreeNode root = new BinaryTreeNode(frontOrder[0]);
        root.setLeft(null);
        root.setRight(null);
        int leftLength = 0;
        //从中序结点中获取前序结点这个数所在的位置，因为中序结点中左侧是左字数，右侧是右字数
        for (int i = 0; i < inOrder.length; i++) {
            if (inOrder[i] == root.getValue()) {
                break;
            } else {
                leftLength++;
            }
        }
        //获取右子树的个数
        int rightLength = inOrder.length - leftLength - 1;
        if (leftLength > 0) {
            //再次初始化左侧的左子树
            int[] leftFrontOrder = new int[leftLength];
            int[] leftInorder = new int[leftLength];
            for (int j = 0; j < leftLength; j++) {
                //因为第一个被取走了
                leftFrontOrder[j] = frontOrder[j + 1];
                leftInorder[j] = inOrder[j];
            }
            BinaryTreeNode leftRoot = BinaryTree(leftFrontOrder, leftInorder);
            root.setLeft(leftRoot);
        }
        //再次初始化右侧的右子树
        if (rightLength > 0) {
            int[] rightFrontOrder = new int[rightLength];
            int[] rightInorder = new int[rightLength];
            for (int k = 0; k < rightLength; k++) {
                rightFrontOrder[k] = frontOrder[k + 1 + leftLength];
                rightInorder[k] = inOrder[k + 1 + leftLength];
            }
            BinaryTreeNode rightRoot = BinaryTree(rightFrontOrder, rightInorder);
            root.setRight(rightRoot);
        }
        return root;
    }

    //旋转数组中最小数
    //把一个数组最开始的若干元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
    //输入一个递增排序的数字的一个旋转数组，输出旋转数组的最小元素。
    //例如数组{3,4,5,1,2}位{1,2，3,4,5}的一个旋转，求该数组的最小值
    //思路：最直观的解码并不难，从头到尾遍历数组一次，我们就能找到最小元素但是时间复杂度为O(n）
    //另一种思路，旋转之后的数组实际上是可以划分为两个排序的子数组，而且前面的子数组的元素都大于或者等于后面子数组的元素。我们还注意
    //最小的元素刚好是这两个字数组的分界线.在排序的数组中我们可以用二分查找发实现O(logn)
    //安装旋转规则，第一个元素应该大于或者等于后一个元素（不一定)
    //特殊情况如果把排序数组的前面的0个元素搬到后面，这依然是数组的一个旋转，可以直接返回
    //特殊情况数组{1,0,1,1,1}和数组{1,1,1,0,1}都可以看成递增数组{0,1,1,1,1}的旋转但是二分法不管用，只能使用顺序查找

    public static int minNumberInRotateArray(int[] array) {
        if (array.length == 0) return 0;  // 数组长度为0， 返回0
        int left = 0;   // 开始处理的第一个位置
        int right = array.length - 1;   // 开始处理的最后一个位置
        int mid = left;   // 设置初始位置,可以当第一个数组不成立的时候，直接返回说明是第0个元素排到后面
        // 确保left在前面排好序的位置，right在后面排好序的位置
        while (array[left] >= array[right]) {
            // 当处理数据只有两个返回后一个结果
            if (right - left == 1) {
                return array[right];
            }
            // 取中间的位置
            mid = (left + right) / 2;
            // 如果三个数相等，顺序查找最小值
            if ((array[left] == array[mid]) && (array[left] == array[right]) && (array[mid] == array[right])) {
                return minNum(array, left, right);
            } else if (array[left] >= array[mid]) { // 中间数据在后半部分，最小值在当前mid前面
                right = mid;
            } else {  // 中间数据在前半部分，最小值在当前mid后面
                left = mid;
            }
        }
        return array[mid];
    }

    private static int minNum(int[] array, int left, int right) {
        int min = array[left];
        for (int i = left + 1; i <= right; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //寻找一个数字中的二级制中的1有几个 可能有死循环的解法
    public int tester(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    //常规解法
    public static int tester2(int n) {
        int count = 0;
        int flag = 1;
        while (n != 0) {
            if ((n & flag) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static int count(int n){
        int num = 0;
        while(n!=0){
            n = n&(n-1);
            num++;
        }
        return num;
    }
}
