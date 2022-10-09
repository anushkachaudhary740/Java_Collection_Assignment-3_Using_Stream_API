package corejava.collection.assignmentset3.Assignment03.Assignment6.parser;

import corejava.collection.assignmentset3.Assignment03.Assignment6.mapping.CandidateMap;
import corejava.collection.assignmentset3.Assignment03.Assignment6.model.Candidate;

import java.util.ArrayList;
import java.util.List;

//import static corejava.collection.assignment02.Assignment6.mapping.CandidateMap.map;

public class CandidateParsing {

    public List<Candidate> parseArray(String[] inputData) {
        List<Candidate> list = new ArrayList<Candidate>();
        for (String data : inputData) {
            Candidate candidate = CandidateMap.map(data);
            list.add(candidate);
        }
        return list;

    }
}


