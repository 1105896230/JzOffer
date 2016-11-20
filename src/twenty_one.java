import java.util.Stack;

/**
 * Created by FMT on 2016/11/20.
 */
//包含min函数的栈
public class twenty_one {
    private Stack<Integer> mStacks = new Stack();
    private Stack<Integer> mSuperStacks = new Stack();

    public void push(int node) {
        mStacks.push(node);
        if (mSuperStacks.isEmpty() || node < mSuperStacks.peek()) {
            mSuperStacks.push(node);
        } else {
            mSuperStacks.push(mSuperStacks.peek());
        }
    }

    public int pop() {
        mSuperStacks.pop();
        return mStacks.pop();
    }

    public int min() {
        return mSuperStacks.peek();
    }
}
