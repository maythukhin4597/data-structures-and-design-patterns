package queue;

import queue.CircularQueue.CircularQueueDisplay;
import queue.CircularQueue.CircularQueueImpl;
import queue.NormalQueue.SimpleQueueDisplay;
import queue.NormalQueue.SimpleQueueImpl;

import java.util.Optional;

public class QueueFactory {
    public static Optional<Display> createDisplay(Queue queue) {
        if (queue instanceof CircularQueueImpl) {
            CircularQueueImpl q = (CircularQueueImpl) queue;
            return Optional.of(new CircularQueueDisplay(q));
        }
        if (queue instanceof SimpleQueueImpl) {
            SimpleQueueImpl q = (SimpleQueueImpl) queue;
            return Optional.of(new SimpleQueueDisplay(q));
        } else return Optional.empty();
    }
}
