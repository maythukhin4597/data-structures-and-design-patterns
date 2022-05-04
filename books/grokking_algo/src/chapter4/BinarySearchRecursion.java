package chapter4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class BinarySearchRecursion {
    static int increment = 0;
    static int decrement = 0;

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 9));
        int index = binarySearch(list, 5);

        String resultMsg = index >= 0 ? "Found at " + (increment + index) : "Not found";
        System.out.println(resultMsg);
        System.out.println("increment" + increment);
        System.out.println("decrement" + decrement);
    }

    /**
     * @param list
     * @param item
     * @return does not maintain original index
     */
    static int binarySearch(List<Integer> list, int item) {
        if (Objects.isNull(list) || list.size() == 0) {
            return -1;
        }

        int begin = 0, last = list.size() - 1;
        if (begin > last) {
            return -1;
        }
        if (begin == last && list.get(begin) == item) {
            return begin;
        }
        int mid = -1, midItem = 0;

        mid = (begin + last) / 2;
        if ((midItem = list.get(mid)) == item) {
            return mid;
        }
        if (item > midItem) {
            increment += (mid + 1) - begin;
            begin = mid + 1;
        } else {
            decrement += last - (mid - 1);
            last = mid - 1;

        }
        List<Integer> tempList = list.subList(begin, last + 1);
        return binarySearch(tempList, item);
    }
}
