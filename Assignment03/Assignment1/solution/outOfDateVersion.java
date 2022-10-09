package corejava.collection.assignmentset3.Assignment03.Assignment1.solution;

import corejava.collection.assignmentset3.Assignment03.Assignment1.model.Software;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class outOfDateVersion {
    private List<Software> softwareList;

    public outOfDateVersion(List<Software> studentArrayList ) {

        this.softwareList=studentArrayList;
    }
public Map<String,List<String>> setOfAllVersion(){
    Map<String, List<String>> myMap = softwareList.stream().collect(Collectors.groupingBy(Software::getOperatingSystem,
            Collectors.mapping(Software::getVersion, Collectors.toList())));
			return myMap;
}
    public void findSoftwareName(Map<String, List<String>> myMap) {
        for(Map.Entry<String, List<String>> list : myMap.entrySet()) {
            Integer size = list.getValue().size();
            if(size>2)
                System.out.println(list.getKey());
        }
    }

}


