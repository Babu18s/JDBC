package jdbc_series.crudops;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOperationSQL {
    private ConnectionsClassSQL connectionsClassSQL;
    public  UpdateOperationSQL(ConnectionsClassSQL connectionsClassSQL){
        this.connectionsClassSQL =connectionsClassSQL;

    }
    public  void updateOperation(String tableName,String toUpdate,String whereCondition) throws SQLException, ClassNotFoundException {
        //ConnectionsClassSQL connectionsClassSQL=new ConnectionsClassSQL();

       // String updateQ="UPDATE "+tableName+ toUpdate+ whereCondition;

        PreparedStatement preparedUpdateSt=connectionsClassSQL.getDatabaseConnection().prepareStatement("UPDATE "+tableName+" SET "+toUpdate+" WHERE "+whereCondition);
        preparedUpdateSt.executeUpdate();
}
}
