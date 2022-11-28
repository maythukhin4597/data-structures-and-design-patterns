package behavioral.nullobject.geeksforgeeks;

public class Coder extends Emp {
    public Coder(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
