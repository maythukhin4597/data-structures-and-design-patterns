package structural.composite.sourcemaking;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory implements Composite {
    private String name;
    private ArrayList includedFiles = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        includedFiles.add(obj);
    }

    @Override
    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
        CompositeDemo.compositeBuilder.append("   ");
        Iterator iterator = includedFiles.iterator();
        while (iterator.hasNext()) {
            Composite composite = (Composite) iterator.next();
            composite.ls();
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }

    @Override
    public String getName() {
        return name;
    }
}
