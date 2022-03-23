package chapter2;

import java.util.Vector;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {50, 30, 12, 293, 2, 3, 10, 60};
        selectionSortSwapping(arr);
        Vector<Integer> vector = new Vector<>();
        vector.add(50);
        vector.add(30);
        vector.add(12);
        vector.add(293);
        vector.add(2);
        vector.add(3);
        vector.add(10);
        vector.add(60);
        selectionSortNewArr(vector);
    }

    static int[] selectionSortSwapping(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int lastMinIndex = i;
            for (int j = 0; j < arr.length; j++) {
                if (i >= j || arr[i] == arr[j]) continue;
                if (min > arr[j]) {
                    min = arr[j];
                    lastMinIndex = j;
                }
            }
            arr[lastMinIndex] = arr[i];
            arr[i] = min;
        }
        return arr;
    }

    static void selectionSortNewArr(Vector<Integer> arr) {
        Vector<Integer> newVector = new Vector<>(arr.size());

        while (arr.size() > 0) {
            int minIndex = findMin(arr);
            newVector.add(arr.get(minIndex));
            arr.removeElementAt(minIndex);
        }
        System.out.println(newVector);
    }

    static int findMin(Vector<Integer> arr) {
        int min = arr.get(0);
        int lastMinIndex = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
                lastMinIndex = i;
            }
        }
        return lastMinIndex;
    }

}
