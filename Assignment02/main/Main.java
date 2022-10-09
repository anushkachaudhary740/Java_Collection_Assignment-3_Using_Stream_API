package corejava.collection.assignmentset3.Assignment02.main;

import corejava.collection.assignmentset3.Assignment02.model.Server;
import corejava.collection.assignmentset3.Assignment02.parser.ServerParsing;
import corejava.collection.assignmentset3.Assignment02.solution.ServerSolutions;

import java.util.List;
public class Main {
    public static void main(String[] arg){
        try {
            String[] serversInformation = {
                    "Server1,Database,MySQL,5.5",
                    "Server2,Database,MySQL,5.1",
                    "Server3,OS,Ubuntu,12.04",
                    "Server1,OS,Ubuntu,12.04",
                    "Server2,OS,Ubuntu,18.04",
                    "Server3,Language,Python,2.6.3",
                    "Server4,Language,Python,3.9.14",
                    "Server4,Language,Python,3.10.4"
            };
            ServerParsing inputParser=new ServerParsing();
            List<Server> serverList= inputParser.parseArray(serversInformation);
            ServerSolutions sr = new ServerSolutions(serversInformation);
            //Question: 1
            sr.createServerList();
            //Question: 2
            System.out.println("Question: 2..............................................................................");
            sr.sortListByServer();
            //Question: 3
            System.out.println("Question: 3..............................................................................");
           sr.sortListByServerNameSoftwareAndVersion();
            //Question: 4
            System.out.println("Question: 4..............................................................................");
            sr.getDistinctServerName();
            //Question:5
            System.out.println("Question: 5..............................................................................");
            sr.filterRecordForServer();
            //Question: 6
            System.out.println("Question: 6..............................................................................");
            System.out.println(sr.getSortedMap());
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }

    }

}
