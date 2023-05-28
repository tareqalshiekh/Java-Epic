import java.util.List;
import java.util.Optional;
public class GetStudentByIdException {
    public static class StudentNotFound extends Exception {
        public StudentNotFound(String msg) {
            super(msg);
        }
    }
    public static String unChecked(List<String> studentIds, String id) throws RuntimeException {
        for (String studentId : studentIds) {
            if (studentId.equals(id)) {
                return "Student " + id;
            }
        }
        throw new RuntimeException("Student with ID : " + id + " not found");
    }

    public static String checked(List<String> studentIds, String id) throws StudentNotFound {
        for (String stID : studentIds) {
            if (stID.equals(id)) {
                return "Student " + id;
            }
        }
        throw new StudentNotFound("Student with ID : " + id + " not found");
    }

    public static Optional<String> optional(List<String> studentIds, String id) {
        for (String stID : studentIds) {
            if (stID.equals(id)) {
                return Optional.of("Student : " + id);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        List<String> studentIds = List.of("701", "809", "208", "446", "509");
        try {
            String st1 = unChecked(studentIds, "701");
            System.out.println("Student (Unchecked): " + st1);
        } catch (RuntimeException e) {
            System.out.println("Exception caught (Unchecked): " + e.getMessage());
        }

        try {
            String st2 = checked(studentIds, "101");
            System.out.println("Student (Checked): " + st2);
        } catch (StudentNotFound e) {
            System.out.println("Exception caught (Checked): " + e.getMessage());
        }

        Optional<String> st3Optional = optional(studentIds, "107");
        if (st3Optional.isPresent()) {
            String st3 = st3Optional.get();
            System.out.println("Student (Optional): " + st3);
        } else {
            System.out.println("Student not found (Optional).");
        }
    }
}
