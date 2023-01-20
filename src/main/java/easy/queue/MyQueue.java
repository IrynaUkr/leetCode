package easy.queue;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        while (input.isEmpty()) {
            output.push(input.pop());
        }
        output.push(x);
        while (output.isEmpty()) {
            input.push(output.pop());
        }
    }

    public void pop() {
        input.pop();
    }

    public int peek() {
        return input.peek();
    }

    public boolean empty() {
        return input.isEmpty();
    }

}
