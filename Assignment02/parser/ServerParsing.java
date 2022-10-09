package corejava.collection.assignmentset3.Assignment02.parser;
import corejava.collection.assignmentset3.Assignment02.map.ServerMapping;
import corejava.collection.assignmentset3.Assignment02.model.Server;

import java.util.ArrayList;
import java.util.List;

public class ServerParsing {
    public List<Server> parseArray(String[] inputData) {
        List<Server> list = new ArrayList<Server>();
        for (String data : inputData) {
            Server customer = ServerMapping.map(data);
            list.add(customer);
        }
        return list;
    }
}
