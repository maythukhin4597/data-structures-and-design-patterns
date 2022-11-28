package behavioral.visitor.baeldung;

import behavioral.visitor.baeldung.visitable.JsonElement;
import behavioral.visitor.baeldung.visitable.XmlElement;

public class ElementVisitor implements Visitor {
    @Override
    public void visit(XmlElement xe) {
        System.out.println("processing xml element with uuid: " + xe.uuid);
    }

    @Override
    public void visit(JsonElement je) {
        System.out.println("processing json element with uuid: " + je.uuid);
    }
}
