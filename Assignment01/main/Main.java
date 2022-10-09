package corejava.collection.assignmentset3.Assignment01.main;

import corejava.collection.assignmentset3.Assignment01.model.Student1;
import corejava.collection.assignmentset3.Assignment01.parser.StudentParsing;
import corejava.collection.assignmentset3.Assignment01.solution.NameSolutions;

import java.util.List;

public class Main {
    public static void main(String[] arg) {
        try {
            String[] studentsInformation = {
                    "22,Rajesh",
                    "23,Dinesh",
                    "22,Aboli",
                    "26,Mayuresh",
                    "25,Sarika",
                    "24,Ketaki"
            };
            StudentParsing inputParser = new StudentParsing();
            List<Student1> student1List = inputParser.parseArray(studentsInformation);
            NameSolutions nm = new NameSolutions(student1List);
            System.out.println("Sort the list by name: ");
            System.out.println("___________________________");
            nm.sortListByName();
            System.out.println("___________________________");
            System.out.println("Sort the list by Id: ");
            System.out.println("___________________________");
            nm.sortListById();
            System.out.println("___________________________");
            System.out.println("filter the list of students for studentId > 23: ");
            System.out.println("__________________________");
            nm.filterByStudentIdGreater();
            System.out.println("___________________________");
            System.out.println("filter the list of students for length of name greater than 5: ");
            System.out.println("__________________________");
            nm.filterTheLengthOfName();
            System.out.println("___________________________");
            System.out.println("get a list of student names for those having length of name greater than 5: ");
            System.out.println("______________________________");
            nm.getListOfStudentName();
            System.out.println("___________________________");
            System.out.println("Map of Student: ");
            System.out.println("______________________________");
            nm.getMapOfData();
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}