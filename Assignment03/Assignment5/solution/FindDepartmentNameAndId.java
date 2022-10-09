package corejava.collection.assignmentset3.Assignment03.Assignment5.solution;

import corejava.collection.assignmentset3.Assignment03.Assignment5.model.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindDepartmentNameAndId {
    private List<Student> studentList;

    public FindDepartmentNameAndId(List<Student> studentList) {

        this.studentList = studentList;
    }


    public Map<String, Student> findMapOfDepartmentNameWithAllDetails() {

        Map<String, Student> myMap = studentList.stream()
                .collect(Collectors
                        .groupingBy(Student::getDepartment, Collectors
                                .collectingAndThen(Collectors
                                        .maxBy(Comparator.comparingInt(Student::getSalary)), Optional::get)));

        return myMap;
    }
    public void findDepartmentNameAndId(Map<String,Student>myMap){
        for (Map.Entry<String, Student> entry : myMap.entrySet()) {
            System.out.println(entry.getValue().getDepartment() + ": " + entry.getValue().getStudentId());
        }
    }


}



