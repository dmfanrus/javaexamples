package module_6;

public class ConnectionManager {

    private Connection[] connections;
    private String[] info;

    public ConnectionManager(int num, String host, String port){
        info = new String[]{host, port};
        connections = new Connection[num];
        for(int i=0;i<connections.length;i++){
            connections[i] = Connection.getConnection(host,port);
        }
    }

    public Connection getConnection(){
        for (Connection conn: connections) {
            if(!conn.isBusy()){
                conn.setBusy(true);
                return conn;
            }
        }
        return null;
    }

    public int countFree(){
        int num = 0;
        for (Connection conn: connections) {
            if(!conn.isBusy())
                num+=1;
        }
        return num;
    }

    public String[] getInfo(){
        return info;
    }


    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager(20, "192.168.0.1", "8080");
        System.out.println(connectionManager.countFree());
        Connection connection1 = connectionManager.getConnection();
        System.out.println(connectionManager.countFree());
        Connection connection2 = connectionManager.getConnection();
        System.out.println(connectionManager.countFree());

    }

}
