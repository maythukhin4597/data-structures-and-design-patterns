package queue.Dequeue;

public class DequeueImpl {
    static final int MAX = 10;
    int arr[];
    int front;
    int rear;
    int size;

    public DequeueImpl(int size) {
        arr = new int[MAX];
        front = -1;
        rear = 0;
        this.size = size;
    }

    boolean isFull() {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    boolean isEmpty() {
        return front == -1;
    }

    public void insertfront(int key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }

        if (front == -1)
            front = rear = 0;
        else if (front == 0)
            front = size - 1;
        else
            front = front - 1;

        arr[front] = key;
    }

    public void insertrear(int key) {
        if (isFull()) {
            System.out.println(" Overflow ");
            return;
        }

        if (front == -1)
            front = rear = 0;
        else if (rear == size - 1)
            rear = 0;
        else
            rear = rear + 1;

        arr[rear] = key;
    }

    public void deletefront() {
        if (isEmpty()) {
            System.out.println("Queue Underflow\n");
            return;
        }

        // Deque has only one element
        if (front == rear)
            front = rear = -1;
        else if (front == size - 1)
            front = 0;
        else
            front = front + 1;
    }

    public void deleterear() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0)
            rear = size - 1;
        else
            rear = rear - 1;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        if (isEmpty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return arr[rear];
    }

}
