package corejava.collection.assignmentset3.Assignment03.Assignment5.parser;

import corejava.collection.assignmentset3.Assignment03.Assignment5.mapper.DataMap;
import corejava.collection.assignmentset3.Assignment03.Assignment5.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentParsing {
    public List<Student> parseArray(String[] inputData) {
        List<Student> list = new ArrayList<Student>();
        for (String data : inputData) {
            Student student = DataMap.map(data);
            list.add(student);
        }
        return list;
    }

}
