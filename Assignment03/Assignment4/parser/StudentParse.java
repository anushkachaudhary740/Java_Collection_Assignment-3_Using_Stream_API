package corejava.collection.assignmentset3.Assignment03.Assignment4.parser;
import corejava.collection.assignmentset3.Assignment03.Assignment4.mapper.StudentMapping;
import corejava.collection.assignmentset3.Assignment03.Assignment4.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentParse {
    public List<Student> parseArray(String[] inputData) {
        List<Student> list = new ArrayList<Student>();
        for (String data : inputData) {
            Student student = StudentMapping.map(data);
            list.add(student);
        }
        return list;
    }

}
