package com.xworkz.zeptoapp.manager;
import java.sql.*;
public class HubManagers {
   static Connection connection=null;
    public static void main(String[] args) {
        Statement statement=null;
        try {
            // to find whether driver is found or not
            // it is optional because the driver will be loaded when we add the dependency
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC driver found");
            //Connection establishment through DriverManager
            //it returns Connection interface
            connection =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zeptoDB","root","qwerty");
            System.out.println("connection establishment is successfully");
            //creating statement
            statement=connection.createStatement();
/*
            String  insert1="insert into HubManager values(0,'Harish',29,'7019592776')";
            String insert2="insert into HubManager values(0,'Venkatesh',31,'7019592735')";
            String insert3="insert into HubManager values(0,'Sheshadri',37,'8019592444')";
            statement.addBatch(insert1);
            statement.addBatch(insert2);
            statement.addBatch(insert3);
        //  execute statement
        // it returns int[] array
            int[] row=statement.executeBatch();
            System.out.println("Number of rows inserted: "+row.length);

*/
          //  String query="select * from HubManager";
            String query="select * from HubManager where id=2";
            ResultSet resultSet=statement.executeQuery(query);
/*
        // individual execution
          resultSet.next();
            System.out.println("id: "+resultSet.getInt(1)+" | Name: "+ resultSet.getString(2)+" | Age: "+resultSet.getInt(3)+" | PhoneNumber:"+resultSet.getString(4));
            resultSet.next();
            System.out.println("id: "+resultSet.getInt(1)+" | Name: "+ resultSet.getString(2)+" | Age: "+resultSet.getInt(3)+"   | PhoneNumber:"+resultSet.getString(4));
*/
            while(resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                int age=resultSet.getInt(3);
                String phNum=resultSet.getString(4);
                System.out.println("Id: "+id+" | Name: "+name+" | Age:"+age+" | Phone number: "+phNum);
            }
        }catch (ClassNotFoundException |SQLException e){
            System.out.println(e.getMessage() );
        }
        finally {
            try {
                if(connection!=null)
                    connection.close();
                if(statement!=null)
                    statement.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
        }
    }
}
