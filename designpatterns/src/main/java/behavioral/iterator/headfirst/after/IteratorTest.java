package behavioral.iterator.headfirst.after;

public class IteratorTest {
    public static void main(String[] args) {

        Waitress waitress = new Waitress(new DinerMenu(),new PancakeMenu());
        waitress.printMenu();
    }
}
