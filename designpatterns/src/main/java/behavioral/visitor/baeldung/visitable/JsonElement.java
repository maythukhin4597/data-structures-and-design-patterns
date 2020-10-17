package behavioral.visitor.baeldung.visitable;

import behavioral.visitor.baeldung.Visitor;

public class JsonElement extends ElementVisitable {
    public static final long serialVersionUID = -4920310391137900791L;

    public JsonElement(String uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
