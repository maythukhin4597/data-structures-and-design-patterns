package behavioral.visitor.geeksforgeeks;

public class FruitShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public double visit(ItemEletemtVisitable itemEletemtVisitable) {
        double cost = 0;
        if (itemEletemtVisitable instanceof Fruit) {
            Fruit fruit = (Fruit) itemEletemtVisitable;
            cost = fruit.getPricePerKg() * fruit.getWeight();
            System.out.println(fruit.getName() + " cost = " + cost);
        }
        return cost;
    }
}
