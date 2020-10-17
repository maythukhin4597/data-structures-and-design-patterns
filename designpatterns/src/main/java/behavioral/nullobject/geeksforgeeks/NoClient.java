package behavioral.nullobject.geeksforgeeks;

public class NoClient extends Emp {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available";
    }
}
