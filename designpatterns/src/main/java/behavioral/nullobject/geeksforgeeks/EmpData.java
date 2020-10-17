package behavioral.nullobject.geeksforgeeks;

import java.util.List;

public class EmpData {
    public static final List<String> names = List.of("Lone", "may", "khin");

    public static Emp getClient(String name) {
//        for (String aName : names) {
//            if (aName.equalsIgnoreCase(name)) {
//                return new Coder(name);
//            }
//        }
//        return new NoClient();

        return names.stream()
                .filter(aName -> aName.equalsIgnoreCase(name))
                .<Emp>map(Coder::new)
                .findFirst()
                .orElse(new NoClient());
    }
}
