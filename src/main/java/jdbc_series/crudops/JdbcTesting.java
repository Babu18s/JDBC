package jdbc_series.crudops;


import java.sql.*;

public class JdbcTesting {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conT= DriverManager.getConnection("jdbc:mysql://localhost:3306/Practicesql2","root","Ravibabu@21");
        Statement stM=conT.createStatement();
        //insertData(stM, 12 , "Ravi" , 1 , "Testing") ;
        PreparedStatement preSmt = conT.prepareStatement("INSERT INTO sampledata VALUES (?,?,?,?)");

        preSmt.setInt(1,515);
        preSmt.setString(2,"Raja");
        preSmt.setInt(3,25);
        preSmt.setString(4,"QA");
        preSmt.executeUpdate();

         ResultSet rst= stM.executeQuery("Select * from sampledata");
         while (rst.next()){
          System.out.println(rst.getInt(3)+" "+rst.getString(4)  );
       }
       stM.close();
       conT.close();
    }

    public Connection getDatabaseConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conT= DriverManager.getConnection("jdbc:mysql://localhost:3306/Practicesql2","root","Ravibabu@21");
        return conT;
    }


   /* public static void insertData(Statement statement , int id , String name , int i, String s) throws SQLException {
        String sql = "INSERT INTO sampledata VALUES ( " + id + ", '" + name + "', " + i + ",'" + s + "')";
        System.out.println(sql);
        int x = statement.executeUpdate(sql);
        if (x > 0 ) {
            System.out.println("Data inserted Succesfully");
        }
    }*/
}
