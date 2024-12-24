package com.xworkz.zeptoapp.drivers;
import java.sql.*;
public class EveningShiftDrivers {
    static Connection connection;
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC driver found");
           connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zeptoDB","root","qwerty");
            System.out.println("connection establishment is successfully");
            String insert1="insert into EveningShiftDrivers values(0,'Mahesh','9878967543','KA13 MN1986')";
            String insert2="insert into EveningShiftDrivers values(0,'Nandeesh','7869856435','KA19 NQ5886')";
            String insert3="insert into EveningShiftDrivers values(0,'Prakash','9897657435','KA21 NM8976')";
            String insert4="insert into EveningShiftDrivers values(0,'Raghu','7867564352','KA09 PQ2986')";
            String insert5="insert into EveningShiftDrivers values(0,'Srikanth','8665489354','KA08 DC8765')";
            Statement statement=connection.createStatement();
            statement.addBatch(insert1);
            statement.addBatch(insert2);
            statement.addBatch(insert3);
            statement.addBatch(insert4);
            statement.addBatch(insert5);
            int[] row=statement.executeBatch();
            System.out.println("Number of row inserted: "+row.length);

        }catch (ClassNotFoundException |SQLException e){
            System.out.println(e.getMessage() );
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
