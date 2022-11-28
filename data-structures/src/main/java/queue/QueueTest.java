package queue;

import queue.Dequeue.DequeueImpl;
import queue.PriorityQueue.PriorityQueueImpl;

public class QueueTest {
    public static void main(String[] args) {
        dequeueTest();
    }

    static void queueTestSimple(Queue q) {
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

//         deQueue removes element entered first i.e. 1
        q.deQueue();

        // Now we have just 4 elements
        display(q);
    }

    public static void queueTest(Queue q) {
        q.deQueue();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        q.enQueue(6);
        display(q);

        q.deQueue();
        display(q);

        q.enQueue(7);

        // Fails to enqueue because front == rear + 1
        q.enQueue(8);
        display(q);

        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        display(q);

    }

    public static void display(Queue queue) {
        QueueFactory.createDisplay(queue)
                .ifPresentOrElse(Display::display,
                        () -> System.out.println("No item found to display"));
    }

    public static void priorityHeapQueueTest() {

        PriorityQueueImpl queue = new PriorityQueueImpl();
        queue.insert(3);
        queue.insert(4);
        queue.insert(9);
        queue.insert(5);
        queue.insert(2);

        System.out.println("Max-Heap array: ");
        queue.printArray();

        queue.deleteNode(4);
        System.out.println("After deleting an element: ");
        queue.printArray();
    }

    public static void dequeueTest() {

        DequeueImpl dq = new DequeueImpl(4);

        System.out.println("Insert element at rear end : 12 ");
        dq.insertrear(12);

        System.out.println("insert element at rear end : 14 ");
        dq.insertrear(14);

        System.out.println("get rear element : " + dq.getRear());

        dq.deleterear();
        System.out.println("After delete rear element new rear become : " + dq.getRear());

        System.out.println("inserting element at front end");
        dq.insertfront(13);

        System.out.println("get front element: " + dq.getFront());

        dq.deletefront();

        System.out.println("After delete front element new front become : " + +dq.getFront());

    }
}

