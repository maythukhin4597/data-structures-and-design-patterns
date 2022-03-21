package stream.functional_interface;

import java.util.stream.Stream;

public class BinaryOperator {
    public static void main(String[] args) {

        Integer sum1 = Stream.iterate(5, t -> t < 100, t -> t + 5)
                .reduce((a, b) -> a + b).get();
        System.out.println("reduce sum" + sum1 + " length : " + (sum1.toString().split("").length));
        Integer sum2 = Stream.iterate(5, t -> t < 100, t -> t + 5)
                .reduce(1, (a, b) -> a + b);
        System.out.println("reduce sum , index 0" + sum2 + " length : " + (sum1.toString().split("").length));
    }

    public static class Supplier {
    }
}
