package jdbc_series.crudops;

import java.sql.SQLException;
import java.sql.Statement;

public class CreateDBT {

    private ConnectionsClassSQL connectionsClassSQL;

    public CreateDBT (ConnectionsClassSQL connectionsClassSQL)
    {
        this.connectionsClassSQL = connectionsClassSQL;

    }


    public  void createDB(String dBName) throws SQLException, ClassNotFoundException {
       String createDB="CREATE DATABASE IF NOT EXISTS "+dBName;
        connectionsClassSQL.setStatement().executeUpdate(createDB);
        String useDB="USE "+dBName;
       // connectionsClassSQL.setStatement().executeQuery(useDB);
        connectionsClassSQL.setStatement().executeUpdate(useDB);

    }
    public  void createDBTable(String tableName) throws SQLException, ClassNotFoundException {
        Statement stmt = connectionsClassSQL.setStatement();
       // String useDB="USE "+"danny";

        String createTable="CREATE TABLE IF NOT EXISTS "+tableName+" ("
                + "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "name VARCHAR(255), "
                + "age INT, "
                + "branch VARCHAR(255))";
       // stmt.execute(useDB);
        stmt.executeUpdate(createTable);
    }
}
