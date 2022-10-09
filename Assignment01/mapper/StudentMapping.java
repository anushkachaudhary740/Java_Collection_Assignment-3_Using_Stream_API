package corejava.collection.assignmentset3.Assignment01.mapper;

import corejava.collection.assignmentset3.Assignment01.model.Student1;

public class StudentMapping {
    public static Student1 map(String data){

        try {
            String[] splitArray = data.split(",");
            Integer studentId = Integer.parseInt(splitArray[0]);
            String studentName = splitArray[1];
            Student1 student1 = new Student1(studentId, studentName);
            return student1;
        } catch (NumberFormatException n) {
            throw new RuntimeException(n);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
