package jdbc_series.crudops;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataOperation {
    private ConnectionsClassSQL connectionsClassSQL;
    public InsertDataOperation(ConnectionsClassSQL connectionsClassSQL) {
        this.connectionsClassSQL = connectionsClassSQL;
    }
    public void insertDataQ(String tableName, String name,int age,String branch) throws SQLException, ClassNotFoundException {
        //PreparedStatement preparedStatement=connectionsClassSQL.
      /*  String dataBasew="USE danny";
        Statement statement=connectionsClassSQL.setStatement();
        statement.execute(dataBasew);*/
       PreparedStatement prepareStatement = connectionsClassSQL.getDatabaseConnection().prepareStatement("INSERT INTO " + tableName + "(name,age,branch) VALUES (?,?,?)");

        prepareStatement.setString(1,name);
        prepareStatement.setInt(2,age);
        prepareStatement.setString(3,branch);
        prepareStatement.executeUpdate();

    }
}
