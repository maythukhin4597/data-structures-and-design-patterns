package lambda;


import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Intermediate stream operations using peek and map
 */
public class ExtractStreamData {
    public static void main(String[] args) {
        List<Student> studentList = Student.getStudents();
        System.out.println("Peek list");
        List<Student> peekList = studentList.stream().peek(System.out::println).collect(Collectors.toList());
        List<String> mapList = studentList.stream().map(ExtractStreamData.getName).collect(Collectors.toList());
        List<Student> filteredList = studentList.stream()
                .filter(s -> isKhin.test(s.getName()))
                .collect(Collectors.toList());

        System.out.println("print operations with consumer foreach");
        peekList.forEach(System.out::println);
        System.out.println("print operations with custom consumer");
        mapList.forEach(ExtractStreamData::print);
        System.out.println("filter operations with custom consumer");
        filteredList.forEach(System.out::println);

//        Optional<Student> student = studentList.stream().filter(s -> s.getName().equals("lara")).findFirst();
//        if(student.isPresent()){
//            System.out.println("Student is present" + student.get().getName());
//        }
//        Student student1 = studentList.stream().filter(s->s.getName().equals("nora")).findFirst()
//                .orElseThrow(() -> new RuntimeException("run"));
//        System.out.println("student not present" + student1.getName());
//        List<Student> nullStudents = Arrays.asList(new Student(null,"null"), new Student(1l,"not null"),null);
//        nullStudents.stream().map(a-> a.getId()).forEach(System.out::println);
//        filteredList.stream().map(a-> a.getId()).forEach(System.out::println);
//
//        Optional<Student> newStudent = null;
//        System.out.println(newStudent.map(s -> s.getId()).orElse(1L));

        CustomHello hello = () -> System.out.println("Say hello");
        hello.displayHello();


    }

    public static void print(String text) {
        System.out.println("custom" + text);
    }

    static Predicate<String> isKhin = (s) -> s.equals("khin");
    static Function<Student,String> getName = (t) -> t.getName();

    public static String addIdAndString(int a, String text) {
        return a + text;
    }



}
