package corejava.collection.assignmentset3.Assignment01.model;
public class Student1 {
    private Integer studentId;
    private String studentName;
    public Student1(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Id: {0}\t Name: {1}\n", studentId, studentName);
    }


}
