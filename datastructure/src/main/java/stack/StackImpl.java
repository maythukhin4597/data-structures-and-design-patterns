package stack;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class StackImpl implements Stack {
    private Object arr[];
    private int top;
    private int capacity;

    public StackImpl(int capacity) {
        arr = new Object[capacity];
        this.capacity = capacity;
        top = -1;
    }

    @Override
    public boolean empty() {
        return top == -1;
    }

    @Override
    public Object peek() {
        return arr[top];
    }

    @Override
    public Object pop() {
        if (empty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    @Override
    public void push(Object o) {
        checkFull();
        arr[++top] = o;
    }

    private void checkFull() {
        if (top == capacity - 1) {
            capacity += 1;
            arr = Arrays.copyOf(arr, capacity);
        }
    }

    @Override
    public int search(Object o) {
        return -1;
    }

    @Override
    public int indexOf(Object o) {
        return IntStream.range(0, arr.length)
                .filter(item -> arr[item] == o)
                .findFirst()
                .orElse(-1);
    }

    @Override
    public int lastIndexOf(Object o) {
        return -1;
    }

    @Override
    public boolean remove(Object object) {
        return false;
    }

    @Override
    public boolean removeElement(Object object) {
        return false;
    }

    @Override
    public void removeElementAt(int index) {
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate p) {
        return false;
    }
}
