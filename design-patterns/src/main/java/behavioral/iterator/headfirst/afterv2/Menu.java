package behavioral.iterator.headfirst.afterv2;

import java.util.Iterator;

public interface Menu {
    void setName(String name);

    String getName();

    Iterator createIterator();
}
