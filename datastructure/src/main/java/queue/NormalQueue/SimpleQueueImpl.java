package queue.NormalQueue;

import queue.Queue;

public class SimpleQueueImpl implements Queue {
    int SIZE = 5;
    Object items[] = new Object[SIZE];
    int front, rear;

    SimpleQueueImpl() {
        front = -1;
        rear = -1;
    }

    SimpleQueueImpl(SimpleQueueImpl simpleQueue) {
        this.SIZE = simpleQueue.SIZE;
        this.items = simpleQueue.items;
        this.front = simpleQueue.front;
        this.rear = simpleQueue.rear;
    }

    public boolean isFull() {
        return rear == SIZE - 1;
    }

    @Override
    public Object peek() {
        return items[front];
    }

    @Override
    public int size() {
        return SIZE;
    }

    @Override
    public Queue clone() {
        return new SimpleQueueImpl(this);
    }

    @Override
    public int getFront() {
        return front;
    }

    @Override
    public int getRear() {
        return rear;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enQueue(Object element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        items[rear] = element;
        System.out.println("Added " + element);
    }

    public Object deQueue() {
        Object element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                front++;
            }
            return (element);
        }
    }

}
