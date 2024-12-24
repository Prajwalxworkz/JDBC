package com.xworkz.zeptoapp.drivers;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MorningShiftDrivers {
    static Connection connection;
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC driver found");
            connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zeptoDB","root","qwerty");
            System.out.println("connection establishment is successfully");
//            String insert="insert into MorningShiftDrivers values(0,'Abhishek','7019592333','KA05 MN1986')";
//            String insert="insert into MorningShiftDrivers values(0,'Balu','7019592334','KA01 NQ5886')";
//            String insert="insert into MorningShiftDrivers values(0,'Chiranth','7019592335','KA05 NM8976')";
//            String insert="insert into MorningShiftDrivers values(0,'Dheeraj','8019592333','KA06 PQ2986')";
//            String insert="insert into MorningShiftDrivers values(0,'Eesha','9019592333','KA02 DC8765')";
//            String insert="insert into MorningShiftDrivers values(0,'Fahad','7019592398','KA11 QM3986')";
//            String insert="insert into MorningShiftDrivers values(0,'Ganesh','8019592353','KA04 PQ6986')";
//            String insert="insert into MorningShiftDrivers values(0,'Hemanth','9019592387','KA18 HG3424')";
//            String insert="insert into MorningShiftDrivers values(0,'Jaggesh','7019592756','KA05 MN7786')";
            String insert="insert into MorningShiftDrivers values(0,'Komal','7019592755','KA02 PQ8743')";
            Statement statement=connection.createStatement();
           int row= statement.executeUpdate(insert);
            System.out.println("Number of row inserted: "+row);
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("JDBC driver not found "+e.getMessage() );
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
