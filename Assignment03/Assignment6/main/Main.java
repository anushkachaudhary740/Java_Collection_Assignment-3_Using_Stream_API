package corejava.collection.assignmentset3.Assignment03.Assignment6.main;

import corejava.collection.assignmentset3.Assignment03.Assignment6.model.Candidate;
import corejava.collection.assignmentset3.Assignment03.Assignment6.parser.CandidateParsing;
import corejava.collection.assignmentset3.Assignment03.Assignment6.solution.HighestVotes;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
     try {
         String[] input={
                 "22,Ravi Pawar, Aundh,1603",
                 "23,Suvarna Kale, Baner,803",
                 "27,Vinod Chavan, Aundh,809",
                 "29,Vasant Mahajan, Aundh,617",
                 "32,Aarti Patil, Baner,351",
                 "34,Swaran Bijur, Baner,35"
         };
        CandidateParsing inputParser = new CandidateParsing();
        List<Candidate> candidateList= inputParser.parseArray(input);

        HighestVotes om = new HighestVotes(candidateList);
        Map<String,Candidate> name = om.findMapOfPlaceName();
       om.findPlaceAndId(name);
    }catch(Exception e){
       throw new RuntimeException(e);
   }

    }
}
