package behavioral.nullobject.geeksforgeeks;

public class NullObjectTest {
    public static void main(String[] args) {
        Emp emp1 = EmpData.getClient("lone");
        Emp emp2 = EmpData.getClient("may");
        Emp emp3 = EmpData.getClient("thu");
        Emp emp4 = EmpData.getClient("khin");


        System.out.println(emp1.getName());
        System.out.println(emp2.getName());
        System.out.println(emp3.getName());
        System.out.println(emp4.getName());
    }
}
