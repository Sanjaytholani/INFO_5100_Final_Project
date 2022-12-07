/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sanjaytholani
 */
public class JDBCConnection {
    public static Connection Connect(){
        try{
       Class.forName("com.mysql.jdbc.Driver");
       System.out.println("connection to db");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root@123");
            System.out.println("connected ");
        Statement statement = (Statement) connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("Select * from hospital.login");
                                                         
//        while(resultSet.next()){
//            System.out.println("Hi");
//            System.out.print(resultSet.getString("login.role"));
            return connection;
//        }
        }
        catch(ClassNotFoundException | SQLException e){
            return null;
        }
    }
}
