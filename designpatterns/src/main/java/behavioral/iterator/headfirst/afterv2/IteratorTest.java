package behavioral.iterator.headfirst.afterv2;

public class IteratorTest {
    public static void main(String[] args) {

//        Waitress waitress = new Waitress(new DinerMenu(), new PancakeMenu(), new CafeMenu());
//        waitress.printMenu();

        Waitressv2 waitressv2 = new Waitressv2(new DinerMenu(), new PancakeMenu());
        waitressv2.printMenu();
    }
}
