package corejava.collection.assignmentset3.Assignment02.map;

import corejava.collection.assignmentset3.Assignment02.model.Server;
public class ServerMapping {
    public static Server map(String data) {

        String[] splitArray = data.split(",");
        try {
            ;
            String version = splitArray[3];
            String server = splitArray[0];
            String dataBase = splitArray[1];
            String operatingSystem = splitArray[2];
            Server software = new Server(server, dataBase,operatingSystem, version);

            return software;
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
