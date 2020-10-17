package behavioral.visitor.geeksforgeeks;

public class BookShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public double visit(ItemEletemtVisitable itemEletemtVisitable) {
        double cost = 0;
        if (itemEletemtVisitable instanceof Book) {
            Book book = (Book) itemEletemtVisitable;
            //apply 5$ discount if book price is greater than 50
            if (book.getPrice() > 50) {
                cost = book.getPrice() - 5;
            } else
                cost = book.getPrice();
            System.out.println("Book ISBN::" + book.getIsbNumber() + " cost =" + cost);
        }
        return cost;
    }
}
