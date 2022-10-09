package corejava.collection.assignmentset3.Assignment03.Assignment6.solution;

import corejava.collection.assignmentset3.Assignment03.Assignment6.model.Candidate;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestVotes {
    private final List<Candidate> candidateArrayList;

    public HighestVotes(List<Candidate> candidateArrayList ) {

        this.candidateArrayList=candidateArrayList;
    }

    public Map<String,Candidate> findMapOfPlaceName() {
        Map<String, Candidate> myMap = candidateArrayList.stream()
                .collect(Collectors
                        .groupingBy(Candidate::getPlace, Collectors
                                .collectingAndThen(Collectors
                                        .maxBy(Comparator.comparingInt(Candidate::getCandidateVotes)), Optional::get)));

        return myMap;
    }
    public void findPlaceAndId(Map<String,Candidate>myMap){
        for (Map.Entry<String, Candidate> entry : myMap.entrySet()) {
            System.out.println(entry.getValue().getPlace() + ": " + entry.getValue().getCandidateId());
        }

    }


}
