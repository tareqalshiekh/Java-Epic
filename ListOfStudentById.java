import java.util.ArrayList;
import java.util.List;
public class ListOfStudentById extends Exception {
    public ListOfStudentById(String msg){
        super(msg);
    }
    public static List<String> getStudentsById(List<String> studentId) throws ListOfStudentById {
        List<String> students = new ArrayList<>();
        for (String id : studentId) {
            if (id.equals("122")) {
                throw new ListOfStudentById("Student with ID " + id + " not found.");
            }
            students.add("Student " + id);
        }
        return students;
    }
    public static void main(String[] args) {
        List<String> sID0 = List.of("911", "122", "123", "254", "501");
        List<String> sID2 = List.of("911", "122", "123", "254", "501");
        List<String> sID1 = List.of("105", "1222", "1023", "514", "695");
        try {
            List<String> students = getStudentsById(sID0);
            System.out.println("Students: " + students);
        }
        catch (ListOfStudentById e) {
            System.out.println("Exception : " + e.getMessage());
        }

        System.out.println("=====================================================");
        try {
            List<String> students = getStudentsById(sID1);
            System.out.println("Students: " + students);
        }
        catch (ListOfStudentById e) {
            System.out.println("Exception : " + e.getMessage());
        }
        System.out.println("=====================================================");
        try {
            List<String> students = getStudentsById(sID2);
            System.out.println("Students: " + students);
        }
        catch (ListOfStudentById e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
