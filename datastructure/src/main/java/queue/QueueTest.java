package queue;

public class QueueTest {
    public static void main(String[] args) {
//        testQueue(new SimpleQueueImpl());
//        testQueue(new CircularQueueImpl());
        testCQueue(new SimpleQueueImpl());
    }

    static void display(Queue<Integer> queue) {

        Queue<Integer> tempQueue = queue.clone();
        if (tempQueue.isEmpty())
            return;
        for (int i = queue.getFront(); i <= queue.getRear(); i++) {
            Integer x = tempQueue.deQueue();
            System.out.println(x + " ");
        }
    }

    static void testQueue(Queue q) {
        // deQueue is not possible on empty queue
        q.deQueue();

        // enQueue 5 elements
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // 6th element can't be added to queue because queue is full
        q.enQueue(6);

        display(q);

//         deQueue removes element entered first i.e. 1
        q.deQueue();

        // Now we have just 4 elements
        display(q);
    }

    public static void testCQueue(Queue q) {
        q.deQueue();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        q.enQueue(6);

        displayCQueue(q);
        Integer elem = (Integer) q.deQueue();

        if (elem != -1) {
            System.out.println("Deleted Element is " + elem);
        }
        displayCQueue(q);

        q.enQueue(7);

        displayCQueue(q);

        // Fails to enqueue because front == rear + 1
        q.enQueue(8);

        displayCQueue(q);
    }

    static void displayCQueue(Queue<Integer> queue) {

        Queue<Integer> tempQueue = queue.clone();
        if (tempQueue.isEmpty())
            return;
        for (int i = queue.getFront(); i != queue.getRear(); i = (i + 1) % queue.size()) {
            Integer x = tempQueue.deQueue();
            System.out.println(x + " ");
        }
    }

}

