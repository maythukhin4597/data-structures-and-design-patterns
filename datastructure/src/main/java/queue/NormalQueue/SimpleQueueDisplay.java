package queue.NormalQueue;

import queue.Display;
import queue.Queue;

public class SimpleQueueDisplay implements Display {

    SimpleQueueImpl simpleQueue;

    public SimpleQueueDisplay(SimpleQueueImpl simpleQueue) {
        this.simpleQueue = simpleQueue;
    }

    @Override
    public void display() {
        Queue tempQueue = simpleQueue.clone();
        if (tempQueue.isEmpty())
            return;
        System.out.println("=====Queue Display=======");
        for (int i = tempQueue.getFront(); i <= tempQueue.getRear(); i++) {
            Object x = tempQueue.deQueue();
            System.out.println(x + " ");
        }
        System.out.println("============================");
    }
}
