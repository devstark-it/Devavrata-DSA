package stack_dsa;

import java.util.*;

public class MinimumStack {
    public static void main(String[] args)
    {
        MinimumStack myStack = new MinimumStack();
        myStack.push(1);
        myStack.push(7);
        myStack.push(4);
        myStack.push(0);
        myStack.push(-2);
        myStack.push(3);
        myStack.getMinimum();
        System.out.println("Minimum  value -> "+ myStack.getMinimum());
        myStack.pop();
        myStack.pop();
        myStack.getMinimum();
        System.out.println("Minimum value -> "+ myStack.getMinimum());
        myStack.top();
        System.out.println("Top element of Stack -> "+ myStack.top());
    }

    static Stack<Integer> stack;
    static Stack<Integer> minimum;

    public MinimumStack() {
        stack = new Stack<>();
        minimum = new Stack<>();
    }

    public void push(int num) {
        if (!minimum.isEmpty() && num <= minimum.peek()){
            minimum.push(num);
        }
        else if(minimum.isEmpty()) {
            minimum.push(num);
        }
        stack.push(num);
    }

    public void pop() {
        if(minimum.peek() == stack.peek()) {
            minimum.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMinimum() {
        return minimum.peek();
    }


}
