package behavioral.nullobject.geeksforgeeks;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.logging.Logger;

public class OptionalTest {
    final static Logger logger = Logger.getLogger(OptionalTest.class.getName());
    static List<String> names = List.of("lone", "may");

    public static void main(String[] args) {
        String name = Optional.of("baeldung")
                .orElse(getRandomName());
    }

    public static String getRandomName() {
        logger.info("getRandomName() method - start");

        Random random = new Random();
        int index = random.nextInt(2);

        logger.info("getRandomName() method - end");
        return names.get(index);
    }
}
