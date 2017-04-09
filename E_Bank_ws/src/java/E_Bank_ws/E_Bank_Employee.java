/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_Bank_ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import com.mysql.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Suwadith
 */
@WebService(serviceName = "E_Bank_Employee")
public class E_Bank_Employee {
    
    private static Connection conn = null;
    private static Statement stmt = null;

    private Connection makeConnection() throws SQLException {
        if (conn == null) {
            new com.mysql.jdbc.Driver();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/e_bank", "root", "");
        }
        return conn;
    }
    
    public boolean registerEmployee(String name, String position, String username, String password) {
        boolean flag=false;
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }

        try {
            String sql = "INSERT INTO employee_details(name, position, username, password) VALUES('" + name + "','" + position + "','" + username + "','" + password + "')";
            stmt = conn.createStatement();
            int rs = stmt.executeUpdate(sql);

            flag=true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return flag;
    }
    
    public boolean loginEmployee(String username, String password) {
        boolean flag=false;
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }

        try {
            String sql = "SELECT username, password FROM employee_details WHERE username='" + username + "' AND password='" + password + "'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
//            String status;
            if (!rs.next()) {
                flag=false;
            } else {
                flag=true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return flag;
    }

    public boolean editEmployee(String name, String position, String username, String password) {
        boolean flag=false;
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }

        try {
            String sql = "UPDATE employee_details SET name='" + name + "', position='" + position + "', username='" + username + "', password='" + password + "' WHERE username='" + username+"'";
            stmt = conn.createStatement();
            int rs = stmt.executeUpdate(sql);
            if(rs==1){
                flag=true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return flag;
    }
    
    public boolean deleteEmployee(String username) {
        boolean flag=false;
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }
        
        try{
            String sql = "DELETE FROM employee_details WHERE username='"+username+"'";
            stmt = conn.createStatement();
            int rs = stmt.executeUpdate(sql);
            if(rs==1){
                flag=true;
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return flag;
    }
    
    public boolean displayEmployeeList() {
        boolean flag=false;
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }
        
        try{
            String sql = "SELECT name, position, username FROM employee_details";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("\nname : " + rs.getString("name") + "\nposition : " + rs.getString("position") + "\nusername : " + rs.getString("username")); 
            }
            flag=true;
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return flag;
    }
    
    /*Developed by Raveen S Rathnayake */
    public String[] loadEmployee(String username) {
        String[] array=null;
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }
        
        try{
            String sql = "SELECT name, position, username FROM employee_details WHERE username='"+username+"' ";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                array=new String[3];
                array[0]=rs.getString("name");
                array[1]=rs.getString("position");
                array[2]=rs.getString("username");
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return array;
    }
    
}
