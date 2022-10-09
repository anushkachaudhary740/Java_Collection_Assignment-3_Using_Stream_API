package corejava.collection.assignmentset3.Assignment03.Assignment6.mapping;

import corejava.collection.assignmentset3.Assignment03.Assignment6.model.Candidate;

public class CandidateMap {
    public static Candidate map(String data) {
        String[] splitArray = data.split(",");
        try {
            Integer candidateId = Integer.parseInt(splitArray[0]);
            Integer candidateVotes = Integer.parseInt(splitArray[3]);
            String candidateName = splitArray[1];
            String place = splitArray[2];

            Candidate candidate = new Candidate(candidateId,candidateName,place,candidateVotes);
            return candidate;
        } catch (NumberFormatException n) {
            throw new RuntimeException(n);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

