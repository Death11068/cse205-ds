class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);

        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {

        int removed = stack1.pop();
        return removed;
    }

    public int peek() {

        int top = stack1.peek();
        return top;
    }

    public boolean empty() {

        return stack1.isEmpty();
    }
}

