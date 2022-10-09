package corejava.collection.assignmentset3.Assignment03.Assignment4.mapper;
import corejava.collection.assignmentset3.Assignment03.Assignment4.model.Student;
public class StudentMapping {
    public static Student map(String data) {
        String[] splitArray = data.split(",");
        try {
            Integer studentId = Integer.parseInt(splitArray[0]);
            String subjectName = splitArray[1];
            Integer studentMarks = Integer.parseInt(splitArray[2]);

            Student student = new Student(studentId, subjectName, studentMarks);
            return student;
        } catch (NumberFormatException n) {
            throw new RuntimeException(n);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
