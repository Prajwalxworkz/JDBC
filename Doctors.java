package com.xworkz.hospital.doctors;
import java.sql.*;

public class Doctors {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC driver found");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hospital", "root", "qwerty");
            System.out.println("connection establishment is successfully");
            statement = connection.createStatement();
        /*
            String insert = "insert into Doctors values(1336, 'Dr. P S Ragavan', 28, 'Paediatrician')";
            String insert1 = "insert into Doctors values(1337, 'Dr. Surendra V H H', 40, 'Dermatologist')";
            String insert2 = "insert into Doctors values(1338, 'Dr. Girish Panth', 35, 'Dermatologist')";
            String insert3 = "insert into Doctors values(1339, 'Dr Chandan M N', 10, 'Urologist')";
            String insert4 = "insert into Doctors values(1340, 'Dr Vinod Kumar K', 11, 'Nephrologist')";
            String insert5 = "insert into Doctors values(1341, 'Dr Anupama Hegde', 3, 'General Physician')";
            String insert6 = "insert into Doctors values(1342, 'Dr. Savith Kumar', 11, 'Interventional Radiologist')";
            String insert7 = "insert into Doctors values(1343, 'Dr. Dinesh Kumar G R', 9, 'General Surgeon')";
            String insert8 = "insert into Doctors values(1344, 'Dr Betsy Antony', 15, 'Obstetrician and Gynaecologist')";
            String insert9 = "insert into Doctors values(1345, 'Dr. Pradeep Hosamani H', 15, 'Ent Specialist')";
            statement.addBatch(insert);
            statement.addBatch(insert1);
            statement.addBatch(insert2);
            statement.addBatch(insert3);
            statement.addBatch(insert4);
            statement.addBatch(insert5);
            statement.addBatch(insert6);
            statement.addBatch(insert7);
            statement.addBatch(insert8);
            statement.addBatch(insert9);
            int[] row = statement.executeBatch();
            System.out.println("Number of rows added is " + row.length);
         */
            String query="select * from Doctors";
            String query1="select * from Doctors where id=1344";
            String query2="select * from Doctors where specialization='Dermatologist'";
            String query3="select * from Doctors where specialization='Dermatologist' and yearOfExperience>10";
            String query4="select * from Doctors where yearOfExperience> (select avg(yearOfExperience) from Doctors)";
            String query5="select name, specialization from Doctors where yearOfExperience>35";
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                System.out.println("id: "+resultSet.getInt(1)+"  |  name: "+resultSet.getString(2)+"  |   specialization: "+resultSet.getString(4)+"  |   experience: "+resultSet.getInt(3));
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------");
            ResultSet resultSet1=statement.executeQuery(query1);
            while(resultSet1.next()){
                System.out.println("id: "+resultSet1.getInt(1)+"  |  name: "+resultSet1.getString(2)+"  |   specialization: "+resultSet1.getString(4)+"  |   experience: "+resultSet1.getInt(3));
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------");

            ResultSet resultSet2=statement.executeQuery(query2);
            while(resultSet2.next()){
                System.out.println("id: "+resultSet2.getInt(1)+"  |  name: "+resultSet2.getString(2)+"  |   specialization: "+resultSet2.getString(4)+"  |   experience: "+resultSet2.getInt(3));
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------");

            ResultSet resultSet3=statement.executeQuery(query3);
            while(resultSet3.next()){
                System.out.println("id: "+resultSet3.getInt(1)+"  |  name: "+resultSet3.getString(2)+"  |   specialization: "+resultSet3.getString(4)+"  |   experience: "+resultSet3.getInt(3));
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------");

            ResultSet resultSet4=statement.executeQuery(query4);
            while(resultSet4.next()){
                System.out.println("id: "+resultSet4.getInt(1)+"  |  name: "+resultSet4.getString(2)+"  |   specialization: "+resultSet4.getString(4)+"  |   experience: "+resultSet4.getInt(3));
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------");

            ResultSet resultSet5=statement.executeQuery(query5);
            while(resultSet5.next()){
                System.out.println("name: "+resultSet5.getString(1)+"  |   specialization: "+resultSet5.getString(2));
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null)
                    connection.close();
                if (statement != null)
                    statement.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
