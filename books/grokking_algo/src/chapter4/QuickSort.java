package chapter4;

import java.util.Vector;

public class QuickSort {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(50); //
        vector.add(30); //
        vector.add(12); //
        vector.add(293); //
        vector.add(2); //
        vector.add(3);
        vector.add(10);
        vector.add(60);
        Vector<Integer> result = quickSort(vector);
        System.out.println("result");
        result.stream().forEach(s -> System.out.print(s + ","));
    }

    private static Vector<Integer> quickSort(Vector<Integer> arr) {
        Vector<Integer> less = new Vector<>();
        Vector<Integer> more = new Vector<>();
        if (arr.size() < 2) return arr;
        Integer pivot = arr.get(0);
        if (arr.size() == 2) {
            int temp = arr.get(0);
            if (temp < arr.get(1)) {
                return arr;
            } else {
                arr.set(0, arr.get(1));
                arr.set(1, temp);
                return arr;
            }
        } else {
            for (Integer each : arr) {
                int temp = each;
                if (temp < pivot) {
                    less.add(temp);
                } else {
                    more.add(temp);
                }
            }
        }
        if (less.size() < 1) {
            return more;
        } else if (more.size() < 1) {
            return less;
        }
        System.out.println("\n pivot" + pivot);
        System.out.println("\n less");
        less.stream().forEach(s -> System.out.print(s + ","));
        System.out.println("\n more");
        more.stream().forEach(s -> System.out.print(s + ","));
        Vector<Integer> all = new Vector<>();
        quickSort(less);
        quickSort(more);
        return all;
    }
}
