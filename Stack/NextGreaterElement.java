package stack_dsa;

import java.util.*;

public class NextGreaterElement {

    public static void main(String[] args) {
        NextGreaterElement arr = new NextGreaterElement();
        int[] input = new int[]{ 9, 1, 65, 2, 14, 20 };
        System.out.println("Initial Output Array : "+ Arrays.toString(input));
        int[] output = arr.findNextGreatElement(input);
        System.out.println("Output Array -> "+ Arrays.toString(output));
    }

    public int[] findNextGreatElement(int[] num) {
        int[] outArray = new int[num.length];
        Stack<Integer> indexStack = new Stack<>();

        for(int i=num.length-1;i>=0;i--){
            if(indexStack.isEmpty()) {
                indexStack.push(num[i]);
                outArray[i] = -1;
            }
            else {
                while (!indexStack.isEmpty() && num[i] > indexStack.peek()){
                    indexStack.pop();
                }
                if(!indexStack.isEmpty()) {
                    outArray[i] = indexStack.peek();
                }
                else {
                    outArray[i] = -1;
                    indexStack.push(num[i]);

                }
            }
        }
        return outArray;
    }
}
