package corejava.collection.assignmentset3.Assignment03.Assignment1.model;

public class Software {
    private String server;
    private String dataBase;
    private String operatingSystem;
    private String version;

    public Software(String server, String dataBase, String operatingSystem, String version) {
        this.server = server;
        this.dataBase = dataBase;
        this.operatingSystem = operatingSystem;
        this.version = version;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    @Override
    public String toString() {
        return java.text.MessageFormat.format("Server: {0}\t DataBase: {1}\t OperatingSystem: {2}\t Version: {3}\n", server, dataBase,
                operatingSystem,version);
    }


}