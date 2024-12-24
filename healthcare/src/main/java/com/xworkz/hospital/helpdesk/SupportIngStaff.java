package com.xworkz.hospital.helpdesk;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SupportIngStaff {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC driver found");
            DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hostital","root","qwerty");
            System.out.println("connection establishment is successfully");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("JDBC driver not found "+e.getMessage() );
        }
    }
}
