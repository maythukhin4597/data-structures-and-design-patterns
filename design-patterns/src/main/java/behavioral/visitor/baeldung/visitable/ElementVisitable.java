package behavioral.visitor.baeldung.visitable;

import behavioral.visitor.baeldung.Visitor;

public abstract class ElementVisitable {
    public String uuid;

    public ElementVisitable(String uuid) {
        this.uuid = uuid;
    }

    abstract void accept(Visitor v);
}
