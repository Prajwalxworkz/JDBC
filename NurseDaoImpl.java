package com.xworkz.hospital.dao;

import com.xworkz.hospital.dto.NurseDto;

import java.sql.*;

public class NurseDaoImpl implements NurseDao {
    @Override
    public int addNurse(NurseDto nurseDto) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "qwerty");
            preparedStatement=connection.prepareStatement("insert into Nurses values(?,?,?,?,?)");
            preparedStatement.setInt(1,nurseDto.getId());
            preparedStatement.setString(2, nurseDto.getName());
            preparedStatement.setInt(3,nurseDto.getYeaOfExperience());
            preparedStatement.setString(4,nurseDto.getAssignedTo());
            preparedStatement.setString(5,nurseDto.getShift());
            return preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) connection.close();
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return 0;
    }

    @Override
    public int addNurse(String name, int yearOfExperience, String assignedTo, String shift) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "qwerty");
            preparedStatement=connection.prepareStatement("insert into Nurses values(?,?,?,?,?)");
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,name);
            preparedStatement.setInt(3,yearOfExperience);
            preparedStatement.setString(4,assignedTo);
            preparedStatement.setString(5,shift);
            return preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) connection.close();
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return 0;
    }

    @Override
    public void getNurse() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "qwerty");
            preparedStatement=connection.prepareStatement("select * from Nurses");
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println("id: "+resultSet.getInt(1)+" | name: "+resultSet.getString(2)+" | yearOfExperience: "+resultSet.getInt(3)+" | assignedTo: "+resultSet.getString(4)+" | shift: "+resultSet.getString(5));
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void find(String sql) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "qwerty");
            preparedStatement=connection.prepareStatement(sql);
           resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println("id: "+resultSet.getInt(1)+" | name: "+resultSet.getString(2)+" | yearOfExperience: "+resultSet.getInt(3)+" | assignedTo: "+resultSet.getString(4)+" | shift: "+resultSet.getString(5));
            }
            System.out.println("------------------------------------------------------------------------------------------------");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
