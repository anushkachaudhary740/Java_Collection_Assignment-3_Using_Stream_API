package corejava.collection.assignmentset3.Assignment02.solution;
import corejava.collection.assignmentset3.Assignment02.map.ServerMapping;
import corejava.collection.assignmentset3.Assignment02.model.Server;
import corejava.collection.assignmentset3.Assignment02.versionconverter.VersionConverter;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.*;

public class ServerSolutions {

    public String[] data;
    public List<Server> serverList =new ArrayList<>();
    public ServerSolutions(String[] data){
       this.data = data;
    }


    //create a list of Server from serversInformation.
    public void createServerList() {
        for (String server : data) {
            Server server1 = ServerMapping.map(server);
            this.serverList.add(server1);
        }
    }

    //Sort the list by Server name
    public void sortListByServer(){
        List<Server>sortedServer=serverList.stream().sorted(Comparator.comparing(Server::getServer)).collect(Collectors.toList());
        sortedServer.forEach(value -> System.out.println(value));

    }

    //Sort the list on Server name, software and version number
    public void sortListByServerNameSoftwareAndVersion() {
        List<Server> sortedByServerNameSoftwareAndVersion=serverList.stream()
                .sorted(Comparator.comparing(Server::getServer).thenComparing(Server::getSoftware).thenComparing(Server::getVersion))
                .collect(Collectors.toList());
        sortedByServerNameSoftwareAndVersion.forEach(value->System.out.println(value));


    }
    //get distinct server names
    public void getDistinctServerName(){
        List<String> distinctServer = serverList.stream().map(e->e.getServer()).distinct().collect(Collectors.toList());
        System.out.println(distinctServer);
    }

    //filter records for a given server name
    public void filterRecordForServer(){
        List<String> distinctString = Arrays.asList("Server1","Server2","Server3","Server4");
        for (String str : distinctString) {
            serverList.stream().filter(e -> e.getServer().equals(str)).forEach(value -> System.out.println(value));
        }
    }
    //create map version and software
    public Map<String, SortedSet<String>> getSortedMap() {
        Map<String, SortedSet<String>> mapOfSoftwareAndVersion = serverList.stream()
                .collect(Collectors.toMap(
                        Server::getSoftware,
                        server -> {
                            SortedSet<String> versions = new TreeSet<>(new VersionConverter());
                            versions.add(server.getVersion());
                            return versions;
                        },
                        (prev, current) -> {
                            prev.addAll(current);
                            return prev;
                        }
                ));
        return mapOfSoftwareAndVersion;
    }

}
