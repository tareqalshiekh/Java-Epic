import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    static Student[] students = new Student[]{
            Student.of("Ahmad", 20, Gender.MALE, true, Course.MATH, Course.CHEMISTRY, Course.JAVA),
            Student.of("Mohammad", 25, Gender.MALE, true, Course.MATH, Course.JAVA),
            Student.of("ESA", 15, Gender.MALE, false, Course.MATH, Course.JAVA),
            Student.of("ESRA", 19, Gender.FEMALE, true, Course.MATH, Course.ENGLISH),
            Student.of("DANA", 11, Gender.FEMALE, true, Course.MATH, Course.ENGLISH, Course.PHYSICS),
            Student.of("RUBA", 20, Gender.FEMALE, true, Course.MATH, Course.PHYSICS)};

    public static void main(String[] args) {
        System.out.println("Use Stream of Students to return List of Student’s Age ?");

          List<Integer> listOfStudentAge = Stream.of(students)
                .map(Student::getAge)
                   .collect(Collectors.toList());
                      System.out.println("listOfStudentAge :"+listOfStudentAge);

        System.out.println("Use Stream of Students to group them by two age categories (< 20 , >=20) ?");

            Map<String, List<Student>> getAge = Stream
                    .of(students)
                .collect(Collectors.groupingBy(a -> a.getAge() < 20 ? " <20 " : " >= 20 "));
                     System.out.println("getAge "+getAge);

    }
}
