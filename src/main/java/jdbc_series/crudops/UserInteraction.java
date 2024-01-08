package jdbc_series.crudops;



import java.sql.SQLException;

public class UserInteraction {
/*
        CreateDBT createDBT =new CreateDBT();
        UpdateOperationSQL updateOperationSQL;
        DeleteOperationSQL deleteOperationSQL;
        InsertDataOperation insertDataOperation;
        ReadDataFromDB readDataFromDB;
        ConnectionsClassSQL connectionsClassSQL;*/


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionsClassSQL connectionsClassSQL = new ConnectionsClassSQL();
        CreateDBT createDBT =new CreateDBT(connectionsClassSQL);
       // createDBT.createDB("danny");
       createDBT.createDBTable("dev");
//       InsertDataOperation userInteraction = new InsertDataOperation(connectionsClassSQL);
//        userInteraction.insertDataQ("dev", "ben",40,"EEE");
//        userInteraction.insertDataQ("dev", "stoke",25,"ll");
//        userInteraction.insertDataQ("dev", "kevin",45,"IT");
//        userInteraction.insertDataQ("dev", "pete",54,"ddd");
        ReadDataFromDB readDaDB=new ReadDataFromDB(connectionsClassSQL);
        readDaDB.readDataFromDB("dev");
        UpdateOperationSQL updateOperationSQL=new UpdateOperationSQL(connectionsClassSQL);
        updateOperationSQL.updateOperation("dev","age =12","name ='kevin'");
        DeleteOperationSQL deleteOPs=new DeleteOperationSQL(connectionsClassSQL);
        deleteOPs.deleteOperation("dev ","WHERE id=32");
    }
}
