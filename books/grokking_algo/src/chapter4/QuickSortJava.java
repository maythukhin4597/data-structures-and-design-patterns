package chapter4;

import java.util.Arrays;

public class QuickSortJava {
    public static void main(String[] args) {
        int[] arr = {50, 30, 12, 293, 2, 3, 10, 60};
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1); // remark
        for (int j = begin; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int tempSwap = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = tempSwap;
        return i + 1;
    }
}
