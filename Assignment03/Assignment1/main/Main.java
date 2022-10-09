package corejava.collection.assignmentset3.Assignment03.Assignment1.main;
import corejava.collection.assignmentset3.Assignment03.Assignment1.model.Software;
import corejava.collection.assignmentset3.Assignment03.Assignment1.parser.SoftwareParser;
import corejava.collection.assignmentset3.Assignment03.Assignment1.solution.outOfDateVersion;
import java.util.*;

public class Main {
    public static void main(String[] args) {
try{
    SoftwareParser inputParser = new SoftwareParser();
    String filePath = "/home/anushkac/Downloads/Java Traning/src/corejava/collection/assignment02/Assignment1/inputfile/fileinput.csv";
    List<Software> softwareList = inputParser.parseCSvFile(filePath);
    outOfDateVersion op = new outOfDateVersion(softwareList);
    Map<String,List<String>>highest=op.setOfAllVersion();
    op.findSoftwareName(highest);
}catch(Exception e){
    throw new RuntimeException(e);
}

    }

}