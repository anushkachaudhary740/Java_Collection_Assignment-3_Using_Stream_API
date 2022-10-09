package corejava.collection.assignmentset3.Assignment03.Assignment5.main;

import corejava.collection.assignmentset3.Assignment03.Assignment5.model.Student;
import corejava.collection.assignmentset3.Assignment03.Assignment5.parser.StudentParsing;
import corejava.collection.assignmentset3.Assignment03.Assignment5.solution.FindDepartmentNameAndId;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            String[] input = {"22,Rajan Anand,Engineering,1600000",
                    "23,Swati Patil,Testing,800000",
                    "27,Vijay Chawda,Engineering,800000",
                    "29,Basant Mahapatra,Engineering,600000",
                    "32,Ajay Patel,Testing,350000",
                    "34,Swaraj Birla,Testing,350000"};
            StudentParsing inputParser = new StudentParsing();
            List<Student> studentList = inputParser.parseArray(input);
            FindDepartmentNameAndId op = new FindDepartmentNameAndId(studentList);
            Map<String,Student>myMap=op.findMapOfDepartmentNameWithAllDetails();
            op.findDepartmentNameAndId(myMap);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
