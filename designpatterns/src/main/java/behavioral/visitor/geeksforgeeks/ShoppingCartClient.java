package behavioral.visitor.geeksforgeeks;

import java.util.List;

public class ShoppingCartClient {
    public static void main(String[] args) {
        List<ItemEletemtVisitable> items = List.of(new Book(20, "1234"),
                new Book(100, "5678"), new Fruit("Banana", 2, 10),
                new Fruit("Apple", 5, 5));

        double total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    private static double calculatePrice(List<ItemEletemtVisitable> items) {
        ShoppingCartVisitor bookVisitor = new BookShoppingCartVisitorImpl();
        ShoppingCartVisitor fruitVisitor = new FruitShoppingCartVisitorImpl();
        double sum = 0;
        List<ItemEletemtVisitable> bookList = List.of(items.get(0), items.get(1));
        List<ItemEletemtVisitable> fruitList = List.of(items.get(2), items.get(3));
        for (ItemEletemtVisitable book : bookList) {
            sum = sum + book.accept(bookVisitor);
        }
        for (ItemEletemtVisitable fruit : fruitList) {
            sum = sum + fruit.accept(fruitVisitor);
        }
        return sum;
    }
}
