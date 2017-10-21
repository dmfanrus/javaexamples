package module_6;

public class Connection {
    private String host;
    private String port;
    private boolean busy = false;
    private Connection(String host, String port){
        this.host = host;
        this.port = port;
    }

    static Connection getConnection(String host, String port) {
        return new Connection(host,port);
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    boolean isBusy(){
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

}
