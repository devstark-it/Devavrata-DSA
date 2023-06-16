package stack_dsa;

import java.util.*;

public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(10);
        myStack.push(5);
        myStack.push(1);
        myStack.push(9);

        ReverseStack out = new ReverseStack();
        System.out.println(myStack);
        out.reverseStack(myStack);
        System.out.println(myStack);
    }


    public Stack<Integer> reverseStack(Stack<Integer> stack) {
        //checking before operations if Stack is empty
        if(stack.isEmpty()) {
            return stack;
        }

        int pop = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, pop);

        return stack;
    }

    private void insertAtBottom(Stack<Integer> stack, int value) {
        //checking before operations if Stack is empty
        if(stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int pop = stack.pop();
        insertAtBottom(stack, value);
        stack.push(pop);
    }
}
