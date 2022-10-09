package corejava.collection.assignmentset3.Assignment01.solution;
import corejava.collection.assignmentset3.Assignment01.model.Student1;
import java.util.*;
import java.util.stream.*;
public class NameSolutions {
    //Create a List of Students.
    public List<Student1> student1ArrayList;

    public NameSolutions(List<Student1> student1ArrayList) {
    this.student1ArrayList = student1ArrayList;

    }

    // Sort the list by name.
    public void sortListByName() {
        student1ArrayList.stream().sorted(Comparator.comparing(Student1::getStudentName)).forEach(value -> System.out.println(value));
    }
    // Sort the list by Id
    public void sortListById() {
        student1ArrayList.stream().sorted((first, second) -> second.getStudentId().compareTo(first.getStudentId())).forEach(value -> System.out.println(value));
    }
    // filter the list of students for studentId > 23
    public void filterByStudentIdGreater() {
        student1ArrayList.stream().filter(e -> e.getStudentId() > 23).forEach(value -> System.out.println(value));
    }

    //filter the list of students for length of name greater than 5
    public void filterTheLengthOfName(){
        student1ArrayList.stream().filter(e -> e.getStudentName().length() > 5).forEach(value -> System.out.println(value));
    }
    // get a list of student names for those having length of name greater than 5
    public void getListOfStudentName() {
        List<String> list = student1ArrayList.stream().filter(e -> e.getStudentName().length() > 5).map(e -> e.getStudentName()).collect(Collectors.toList());
        System.out.println(list);
    }
    //create a map as follows
    //key: StudentId
    //value: Student Object
    public void getMapOfData() {
        Map<Integer, String> myMap = student1ArrayList.stream().collect(Collectors.toMap(key -> key.getStudentId(), value -> value.getStudentName(), (a, b) -> a+", "+b));
       myMap.forEach((k,v)->System.out.println(k +" -> " +v));
    }
}
