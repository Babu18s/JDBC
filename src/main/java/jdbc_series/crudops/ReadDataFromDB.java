package jdbc_series.crudops;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadDataFromDB {
    private ConnectionsClassSQL connectionsClassSQL;
    public ReadDataFromDB(ConnectionsClassSQL connectionsClassSQL){
        this.connectionsClassSQL=connectionsClassSQL;

    }
    public void readDataFromDB(String tableName) throws SQLException, ClassNotFoundException {
        ConnectionsClassSQL connectionsClassSQL=new ConnectionsClassSQL();
        ResultSet rst= connectionsClassSQL.setStatement().executeQuery("Select * from "+tableName);
        while (rst.next()){
            System.out.println(rst.getInt(1)+" "+rst.getString(2) +" "+ rst.getInt(3)+" "+rst.getString(4)  );
        }
    }

}
