package structural.composite.sourcemaking;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class File implements Composite {
    private String name;

    @Override
    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
    }

    @Override
    public String getName() {
        return name;
    }
}
