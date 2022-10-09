package corejava.collection.assignmentset3.Assignment02.model;
public class Server {
private String server;
private String dataBase;
private String software;
private String version;

public Server(String server, String dataBase, String software, String version) {
        this.server = server;
        this.dataBase = dataBase;
        this.software = software;
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

public String getSoftware() {
        return software;
        }

public void setSoftware(String software) {
        this.software = software;
        }

public String getVersion() {
        return version;
        }

public void setVersion(String version) {
        this.version = version;
        }
    @Override
    public String toString() {
        return java.text.MessageFormat.format("Server: {0}\t DataBase: {1}\t Software: {2}\t Version: {3}\n", server, dataBase,
                software,version);
    }

        }