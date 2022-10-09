package corejava.collection.assignmentset3.Assignment03.Assignment4.solution;
import corejava.collection.assignmentset3.Assignment03.Assignment4.model.Student;

import java.util.Comparator;
import java.util.List;

public class GetAvgMark {
    private List<Student> studentArrayList;

    public  GetAvgMark(List<Student> studentArrayList ) {

        this.studentArrayList=studentArrayList;
    }
    public Integer findMinId() {
        Integer minById = studentArrayList
                .stream()
                .min(Comparator.comparing(Student::getStudentId)).get().getStudentId();
        return minById;
    }
    public Double findAverage(Integer minById) {
        Double marksOfSubject = studentArrayList.stream().filter(value -> value.getStudentId() == minById).mapToInt(value -> value.getStudentMarks()).average().getAsDouble();
        return marksOfSubject;
    }

}
