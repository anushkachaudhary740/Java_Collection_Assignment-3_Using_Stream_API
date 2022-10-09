package corejava.collection.assignmentset3.Assignment03.Assignment3.main;

import corejava.collection.assignmentset3.Assignment03.Assignment3.model.Library;
import corejava.collection.assignmentset3.Assignment03.Assignment3.parser.LibraryParser;
import corejava.collection.assignmentset3.Assignment03.Assignment3.solution.WithLibrary;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] arg) {
        try {
            LibraryParser inputParser = new LibraryParser();
            String filePath = "/home/anushkac/Downloads/Java Traning/src/corejava/collection/assignment02/Assignment3/inputfile/fileinput.csv";
            List<Library> libraryArrayList = inputParser.parseCSvFile(filePath);
            WithLibrary lb = new WithLibrary(libraryArrayList);
            Map library= lb.findMapOfLibraryNameAndVersion();
            lb.productNameOfLatestversion(libraryArrayList,library);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
