package structural.composite.headfirst.withIterator;

import java.util.Iterator;

public class NullIteraotr implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
