package chapter2;

import java.util.Objects;
import java.util.stream.Collectors;

public class NYPizza extends AbstractPizza {
    @Override
    void display() {
        String pizza = toppings.stream().map(Enum::toString).reduce("", String::concat);
        String pizzaStr = toppings.stream().map(Enum::toString).collect(Collectors.joining(","));
        System.out.println(" Ordered Pizza : " + pizzaStr);
        System.out.println(" Size " + size);
    }

    public enum SIZE {BIG, MEDIUM, SMALL}

    private final SIZE size;

    NYPizza(Builder builder) {
        super(builder);
        size = builder.sizeBuilder;
    }

    public static class Builder extends AbstractBuilder<Builder> {
        private final SIZE sizeBuilder;

        @Override
        NYPizza build() {
            return new NYPizza(self());
        }

        @Override
        protected Builder self() {
            return this;
        }

        public Builder(SIZE sizeBuilder) {
            this.sizeBuilder = Objects.requireNonNull(sizeBuilder);
        }
    }
}
