package chapter2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class AbstractPizza {
    public enum TOPPING {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<TOPPING> toppings;

    abstract static class AbstractBuilder<T extends AbstractBuilder<T>> {
        EnumSet<TOPPING> toppings = EnumSet.noneOf(TOPPING.class);

        public T addTopping(TOPPING topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract AbstractPizza build();

        protected abstract T self();
    }

    AbstractPizza(AbstractBuilder<?> abstractBuilder) {
        toppings = abstractBuilder.toppings.clone();
    }

    abstract void display();
}
