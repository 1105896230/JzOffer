//import java.util.LinkedList;
//import java.util.List;
//
///**
// * Created by Administrator on 2016/12/10.
// */
//public class test60 {
//    /**
//     * 题目：从上到下按层打印二叉树，同一层的结点按从左到右的顺序打印，每一层打印一行。
//     * @param root
//     */
//    public static void print(BinaryTreeNode root) {
//        if (root == null) {
//            return;
//        }
//        List<BinaryTreeNode> list = new LinkedList<BinaryTreeNode>();
//        BinaryTreeNode node;
//        // 当前层的结点个数
//        int current = 1;
//        // 记录下一层的结点个数
//        int next = 0;
//        list.add(root);
//        while (list.size() > 0) {
//            node = list.remove(0);
//            current--;
//            System.out.printf("%-3d", node.val);
//            if (node.left != null) {
//                list.add(node.left);
//                next++;
//            }
//            if (node.right != null) {
//                list.add(node.right);
//                next++;
//            }
//            if (current ==0) {
//                System.out.println();
//                current = next;
//                next = 0;
//            }
//        }
//    }
//}
