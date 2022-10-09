package corejava.collection.assignmentset3.Assignment03.Assignment3.solution;

import corejava.collection.assignmentset3.Assignment03.Assignment3.model.Library;

import java.util.*;
import java.util.stream.Collectors;

public class
WithLibrary {
    private List<Library> libraryArrayList;

    public WithLibrary(List<Library> libraryArrayList ) {

        this.libraryArrayList=libraryArrayList;
    }

    public Map<String,Integer> findMapOfLibraryNameAndVersion() {
        Map<String, Integer> myMap = libraryArrayList.stream()
                .collect(Collectors
                        .groupingBy(Library::getLibraryName, Collectors
                                .collectingAndThen(Collectors
                                        .maxBy(Comparator.comparingInt(Library::getVersion)), e->e.map(Library::getVersion).orElse((int) -1))));
       return myMap;
    }
    public void productNameOfLatestversion(List<Library> libraryArrayList, Map<String,Integer>myMap){
     Set<String>set=libraryArrayList.stream().filter(
                    value->myMap.containsKey(value.getLibraryName()) && value.getVersion()<myMap.get(value.getLibraryName())
            ).map(Library::getProductName).collect(Collectors.toSet());
        for(String s:set)
        {
            System.out.println(s);
        }
}

}
