package queue;

import java.util.Iterator;
import java.util.List;

//Complexity O(1)
public interface Queue<Object> {

    Object deQueue();

    void enQueue(Object o);

    boolean isEmpty();

    boolean isFull();

    Object peek();

    int size();

    Queue clone();

    int getFront();

    int getRear();

}
//applications
//CPU scheduling, Disk Scheduling
//When data is transferred asynchronously between two processes.The queue is used for synchronization.
// eg: IO Buffers, pipes, file IO, etc
//Handling of interrupts in real-time systems.
//Call Center phone systems use Queues to hold people calling them in an order