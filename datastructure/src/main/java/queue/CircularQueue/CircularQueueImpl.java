package queue.CircularQueue;

import queue.Queue;

public class CircularQueueImpl implements Queue<Object> {
    int SIZE = 5;
    Object items[] = new Object[SIZE];
    int front, rear;

    public CircularQueueImpl() {
        front = -1;
        rear = -1;
    }

    public CircularQueueImpl(CircularQueueImpl circularQueue) {
        front = circularQueue.front;
        rear = circularQueue.rear;
        SIZE = circularQueue.SIZE;
        items = circularQueue.items;
    }

    @Override
    public Object deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        Object result = items[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % SIZE;
        }
        return result;
    }

    @Override
    public void enQueue(Object o) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % SIZE;
        }
        items[rear] = o;
        System.out.println("Added " + o);
    }

    @Override
    public boolean isEmpty() {
        return front == -1;
    }

    @Override
    public boolean isFull() {
        return (front == 0 && rear == SIZE - 1) || (front == rear + 1);
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
        return new CircularQueueImpl(this);
    }

    @Override
    public int getFront() {
        return front;
    }

    @Override
    public int getRear() {
        return rear;
    }

}
