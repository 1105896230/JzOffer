import java.util.Stack;

/**
 * Created by FMT on 2016/11/20.
 */
//栈的压入、弹出序列
public class twenty_two {
    Stack<Integer> stack = new Stack();

    public boolean IsPopOrder(int[] push, int[] pop) {
        if (push.length == 0 || pop.length == 0)
            return false;
        int popIndex = 0;
        for (int i = 0; i < push.length; i++) {
            stack.push(push[i]);
            while (!stack.isEmpty() && stack.peek() == pop[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();
    }
}
