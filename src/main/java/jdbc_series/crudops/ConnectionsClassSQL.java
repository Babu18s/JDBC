package jdbc_series.crudops;

import java.sql.*;

public class ConnectionsClassSQL {
    public Connection getDatabaseConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conT= DriverManager.getConnection("jdbc:mysql://localhost:3306/danny","root","Ravibabu@21");
        return conT;
    }
    public Statement setStatement() throws SQLException, ClassNotFoundException {
       Statement stM=getDatabaseConnection().createStatement();
        return stM;
    }


}
