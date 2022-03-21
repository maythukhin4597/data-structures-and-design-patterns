package stream.functional_interface;

import java.util.stream.Stream;

public class Function {
    public static void main(String[] args) {

        System.out.println("map to int sum" + Stream.iterate(5, t -> t < 100, t -> t + 5)
                .mapToInt(a -> a)
                .sum());
    }
}
