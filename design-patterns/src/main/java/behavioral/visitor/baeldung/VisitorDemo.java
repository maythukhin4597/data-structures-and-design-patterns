package behavioral.visitor.baeldung;

import behavioral.visitor.baeldung.visitable.Document;
import behavioral.visitor.baeldung.visitable.JsonElement;
import behavioral.visitor.baeldung.visitable.XmlElement;

import java.util.UUID;

public class VisitorDemo {
    public static void main(String[] args) {

        Visitor v = new ElementVisitor();

        Document d = new Document(generateUuid());
        d.elements.add(new JsonElement(generateUuid()));
        d.elements.add(new JsonElement(generateUuid()));
        d.elements.add(new XmlElement(generateUuid()));

        d.accept(v);

    }

    private static String generateUuid() {
        return UUID.randomUUID()
                .toString();
    }
}
