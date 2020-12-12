package stack;

import java.util.Deque;
import java.util.LinkedList;

class MinStack {
    Deque<Integer> xStack = new LinkedList<>();
    Deque<Integer> minStack = new LinkedList<>();
    /** initialize your data structure here. */
    public MinStack() {
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(),x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
