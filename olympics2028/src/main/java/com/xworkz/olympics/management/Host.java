package com.xworkz.olympics.management;
import java.sql.*;
public class Host {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded and registered");
            DriverManager.getConnection("jdbc:mysql://localhost:3306/olympics","root","qwerty");
            System.out.println("Connection is established");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
