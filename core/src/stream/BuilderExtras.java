/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 7: Java Stream API
Topic:  Stream.Builder
*/
package stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BuilderExtras {
    public static void main(String[] args) {

        // Builder is mutable object, so like a StringBuilder,
        // you do not need to self reference, but you can...
        Stream.Builder<String> builder = Stream.builder();
        builder = builder.add("a");  // ok but not necessary
        builder.add("b");  // this works
        builder.add("c");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);

        Stream.Builder streamBuilder = Stream.builder();
        builder = streamBuilder.add("a");  // ok but not necessary
        streamBuilder.add(10);  // this works
        Stream streamResult = streamBuilder.build();
        streamResult.forEach(System.out::println);

        // Using a raw Builder with chained methods
//        Stream.builder().add("a").add(10).build().forEach(
//                System.out::println);

        // Typing builder() method returns correctly typed Stream
        Stream.<String>builder().add("a").add("b").build().forEach(
                System.out::println);

        Stream.Builder builder3 = Stream.<String>builder();
        builder3.add("a");
        builder3.add(new Object());
        Stream<String> s3 = builder3.build();
        // run time exception for class cast
//        s3.forEach(System.out::println);

        Stream numbers = Stream.of(10,11,12);
        numbers.limit(2);
        // IllegalstateExecption stream has been closed
//        numbers.forEach(System.out::println);

        List<Integer> numberList = new ArrayList<>(List.of(10,20));
        numberList.stream().map(s-> s+ 1);
        numberList.stream().sorted();
        numberList.forEach(System.out::println);

    }
}