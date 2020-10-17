package behavioral.visitor.baeldung.visitable;

import behavioral.visitor.baeldung.Visitor;

import java.io.Serializable;

public class XmlElement extends ElementVisitable implements Serializable {

    public static final long serialVersionUID = 2764836999934360650L;

    public XmlElement(String uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
