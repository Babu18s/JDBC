package jdbc_series.crudops;

import java.sql.*;

/*public class CreatOperation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String jdbcURL = "jdbc:mysql://localhost:3306/";
        String uName = "root";
        String pWord = "Ravibabu@21";
        String dbName = "studentsData";
        Connection conT = DriverManager.getConnection(jdbcURL, uName, pWord);


        Statement stM = conT.createStatement();
        String createDB = "CREATE DATABASE IF NOT EXISTS " + dbName;
        stM.executeUpdate(createDB);
        String useDB = "USE " + dbName;
        stM.executeUpdate(useDB);
        String createTable = "CREATE TABLE IF NOT EXISTS students_info ("
                + "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "name VARCHAR(255), "
                + "age INT, "
                + "branch VARCHAR(255))";
        stM.executeUpdate(createTable);
*/        /*stM.close();
        conT.close()*/
        ;
        /*System.out.println("Database and Table are successfully created");
*/
        //createTable();
        //insertData(stM, 12 , "Ravi" , 1 , "Testing") ;
      /*  PreparedStatement preSmt = conT.prepareStatement("INSERT INTO students_info(name,age,branch) VALUES (?,?,?)");


        preSmt.setString(1,"Ram");
        preSmt.setInt(2,32);
        preSmt.setString(3,"Movie");
        preSmt.executeUpdate();

        preSmt.setString(1,"Dhoni");
        preSmt.setInt(2,26);
        preSmt.setString(3,"Business");
        preSmt.executeUpdate();*/


       /* ResultSet rst= stM.executeQuery("Select * from students_info");
        while (rst.next()){
            System.out.println(rst.getInt(1)+" "+rst.getString(2) +" "+ rst.getInt(3)+" "+rst.getString(4)  );
        }
        //update code
        String updateQ="UPDATE students_info " +
                "SET age =45 " +
                "WHERE id=521";

        PreparedStatement preparedUpdateSt=conT.prepareStatement(updateQ);
        preparedUpdateSt.executeUpdate();
        String deleteQuery= "DELETE " +
                            "from " +
                            "students_info " +
                            "where id=521";
        PreparedStatement preparedDele=conT.prepareStatement(deleteQuery);
        preparedDele.executeUpdate();

        stM.close();
        conT.close();
    }*/
        //till here
  /*  public static void createDB(Statement stM,String dBName) throws SQLException {
        String createDB="CREATE DATABASE IF NOT EXISTS "+dBName;
        stM.executeUpdate(createDB);
        String useDB="USE "+dBName;
        stM.executeUpdate(useDB);

    }
    public static void createTable(Statement stM, String tableName) throws SQLException {
        String createTable="CREATE TABLE IF NOT EXISTS students_info ("
                + "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "name VARCHAR(255), "
                + "age INT, "
                + "branch VARCHAR(255))";
        stM.executeUpdate(createTable);
    }
    public static void deleteOperation(Connection conT, String tableName,String whereCondition) throws SQLException {
        String deleteQuery= "DELETE " +
                "from " +
                "students_info " +
                "where id=521";
        PreparedStatement preparedDele=conT.prepareStatement(deleteQuery);
        preparedDele.executeUpdate();
    }
    public static void updateOperation(String tableName,String whereCondition){
        String updateQ="UPDATE students_info " +
                "SET age =45 " +
                "WHERE id=521";

        PreparedStatement preparedUpdateSt=conT.prepareStatement(updateQ);
        preparedUpdateSt.executeUpdate();
    }
}*/
