package corejava.collection.assignmentset3.Assignment01.parser;

import corejava.collection.assignmentset3.Assignment01.mapper.StudentMapping;
import corejava.collection.assignmentset3.Assignment01.model.Student1;

import java.util.ArrayList;
import java.util.List;

public class StudentParsing {
    public List<Student1> parseArray(String[] inputData) {
        List<Student1> list = new ArrayList<>();
        for (String data : inputData) {
            Student1 student1 = StudentMapping.map(data);
            list.add(student1);
        }
        return list;
    }
}
