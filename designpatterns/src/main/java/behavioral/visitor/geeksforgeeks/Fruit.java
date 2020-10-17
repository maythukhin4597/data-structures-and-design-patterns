package behavioral.visitor.geeksforgeeks;

import lombok.Getter;

@Getter
public class Fruit implements ItemEletemtVisitable {
    private String name;
    private double weight;
    private double pricePerKg;

    public Fruit(String name, double weight, double pricePerKg) {
        this.name = name;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public double accept(ShoppingCartVisitor shoppingCartVisitor) {
        return shoppingCartVisitor.visit(this);
    }
}
