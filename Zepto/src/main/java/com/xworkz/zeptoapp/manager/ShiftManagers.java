package com.xworkz.zeptoapp.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ShiftManagers {
    static Connection connection;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC driver found!!");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zeptoDB", "root", "qwerty");
            System.out.println("connection establishment is successfully!!");
//           String insert = "insert  into ShiftManager values(1,'Pradeep',23,'phantom@gmail.com')";
//            String insert="insert  into ShiftManager values(2,'Ramesh',33,'ramesh@gmail.com')";
//            String insert="insert  into ShiftManager values(3,'Rajendra',36,'rajendrs@gmail.com')";
//            String insert="insert  into ShiftManager values(4,'Shivprakash',31,'shiv@gmail.com')";
            String insert="insert  into ShiftManager values(5,'Harish',29,'harish@gmail.com')";
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(insert);
            System.out.println("Number of rows inserted: " + row);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
