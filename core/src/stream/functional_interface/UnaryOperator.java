package stream.functional_interface;

import java.util.stream.Stream;

public class UnaryOperator {
    public static void main(String[] args) {

        Stream.iterate(5, t-> t<100 ,t-> t+5)
                .forEach(t-> System.out.println(" , " + t ));

    }

}
