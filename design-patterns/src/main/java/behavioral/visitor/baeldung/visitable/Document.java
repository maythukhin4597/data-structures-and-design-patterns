package behavioral.visitor.baeldung.visitable;

import behavioral.visitor.baeldung.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends ElementVisitable {
    public List<ElementVisitable> elements = new ArrayList<>();

    public Document(String uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor v) {
        for (ElementVisitable e : elements) {
            e.accept(v);
        }
    }
}
