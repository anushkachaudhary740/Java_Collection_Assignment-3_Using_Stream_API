package corejava.collection.assignmentset3.Assignment03.Assignment4.main;
import corejava.collection.assignmentset3.Assignment03.Assignment4.model.Student;
import corejava.collection.assignmentset3.Assignment03.Assignment4.parser.StudentParse;
import corejava.collection.assignmentset3.Assignment03.Assignment4.solution.GetAvgMark;

import java.util.*;
public class Main {
    public static void main(String[] arg){
        String input [] = {"22,Data Structures,45","23,English,52","22,English,51",
               "26,Data Structures,72","23,Data Structures,61","24,English,81"};
        StudentParse inputParser=new StudentParse();
        List<Student> studentList=inputParser.parseArray(input);
        GetAvgMark op=new GetAvgMark(studentList);
        Integer minId=op.findMinId();
        System.out.println(op.findAverage(minId));


    }
}
