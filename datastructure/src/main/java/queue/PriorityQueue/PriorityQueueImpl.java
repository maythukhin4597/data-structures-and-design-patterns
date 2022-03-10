package queue.PriorityQueue;

import java.util.ArrayList;

public class PriorityQueueImpl {
    ArrayList<Integer> items;

    public PriorityQueueImpl() {
        items = new ArrayList<>();
    }

    /**
     * @param items
     * @param i     1.Start from the first index of non-leaf node whose index is given by n/2 - 1.
     *              2.Set current element i as largest.
     *              3.The index of left child is given by 2i + 1 and the right child is given by 2i + 2.
     *              4.If leftChild is greater than currentElement (i.e. element at ith index), set leftChildIndex as largest.
     *              If rightChild is greater than element in largest, set rightChildIndex as largest.
     *              5.Swap largest with currentElement
     *              6.Repeat steps 3-7 until the subtrees are also heapified.
     */
    void heapify(ArrayList<Integer> items, int i) {
        int size = items.size();
        // Find the largest among root, left child and right child
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < size && items.get(l) > items.get(largest))
            largest = l;
        if (r < size && items.get(r) > items.get(largest))
            largest = r;

        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            int temp = items.get(largest);
            items.set(largest, items.get(i));
            items.set(i, temp);

            heapify(items, largest);
        }
    }

    // Function to insert an element into the tree
    public void insert(Integer newNum) {
        int originSize = items.size();
        items.add(newNum);
        if (originSize != 0) {
//            Start from the first index of non-leaf node whose index is given by n/2 - 1
            for (int i = (originSize / 2) - 1; i >= 0; i--) {
                heapify(items, i);
            }
        }
    }

    // Function to delete an element from the tree
    public void deleteNode(int num) {
        int size = items.size();
        int i = 0;
        if (items.contains(num)) {
            i = items.indexOf(num);
        }
        //swap with last item
        int temp = items.get(i);
        items.set(i, items.get(size - 1));
        items.set(size - 1, temp);


        items.remove(size - 1);
        for (int j = (size / 2) - 1; j >= 0; j--) {
            heapify(items, j);
        }
    }

    // Print the tree
    public void printArray() {
        for (Integer i : items) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
