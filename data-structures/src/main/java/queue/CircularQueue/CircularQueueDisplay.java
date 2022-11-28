package queue.CircularQueue;

import queue.Display;
import queue.Queue;

public class CircularQueueDisplay implements Display {
    CircularQueueImpl circularQueue;

    public CircularQueueDisplay(CircularQueueImpl circularQueue) {
        this.circularQueue = circularQueue;
    }

    @Override
    public void display() {
        System.out.println("=====Queue Display=======");
        if (circularQueue.isEmpty()) {
            System.out.println("Empty Queue");
            return;
        }
        Queue tempQueue = circularQueue.clone();
        while (!tempQueue.isEmpty()) {
            System.out.print(tempQueue.deQueue() + " ");
        }
        System.out.println("\n=========================");
    }
}
