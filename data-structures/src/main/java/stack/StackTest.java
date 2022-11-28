package stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new StackImpl(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.println("\nAfter popping out");
        printStack(stack);
    }

    public static void printStack(Stack<Integer> stack) {
        if (stack.empty())
            return;

        int x = stack.peek();
        // Pop the top element of the stack
        stack.pop();

        // Recursively call the function PrintStack
        printStack(stack);

        // Print the stack element starting from the bottom
        System.out.print(x + " ");

        // Push the same element onto the stack to preserve the order
        stack.push(x);
    }
}
