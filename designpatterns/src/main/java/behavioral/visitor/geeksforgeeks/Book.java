package behavioral.visitor.geeksforgeeks;

import lombok.Getter;

@Getter
public class Book implements ItemEletemtVisitable {
    public double price;
    private String isbNumber;

    public Book(double price, String isbNumber) {
        this.price = price;
        this.isbNumber = isbNumber;
    }

    @Override
    public double accept(ShoppingCartVisitor shoppingCartVisitor) {
        return shoppingCartVisitor.visit(this);
    }
}
