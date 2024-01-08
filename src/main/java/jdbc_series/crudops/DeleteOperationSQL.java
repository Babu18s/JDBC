package jdbc_series.crudops;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteOperationSQL {
    private ConnectionsClassSQL connectionsClassSQL;
    public DeleteOperationSQL(ConnectionsClassSQL connectionsClassSQL){
        this.connectionsClassSQL=connectionsClassSQL;

    }
    public  void deleteOperation(String tableName,String whereCondition) throws SQLException, ClassNotFoundException {
        //ConnectionsClassSQL connectionsClassSQL=new ConnectionsClassSQL();

        String deleteQ="DELETE from "+tableName+whereCondition;

        PreparedStatement preparedUpdateSt=connectionsClassSQL.getDatabaseConnection().prepareStatement(deleteQ);
        preparedUpdateSt.executeUpdate();
    }
    public  void deleteDB(String dBName) throws SQLException, ClassNotFoundException {
       // ConnectionsClassSQL connectionsClassSQL=new ConnectionsClassSQL();

        String deleteQ="DELETE "+dBName;
        PreparedStatement preparedUpdateSt=connectionsClassSQL.getDatabaseConnection().prepareStatement(deleteQ);
        preparedUpdateSt.executeUpdate();
    }
}
