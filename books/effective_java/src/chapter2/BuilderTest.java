package chapter2;

public class BuilderTest {
    public static void main(String[] args) {
        NYPizza nyPizza = new NYPizza.Builder(NYPizza.SIZE.MEDIUM)
                .addTopping(AbstractPizza.TOPPING.MUSHROOM)
                .addTopping(AbstractPizza.TOPPING.HAM)
                .build();
        nyPizza.display();
    }
}
