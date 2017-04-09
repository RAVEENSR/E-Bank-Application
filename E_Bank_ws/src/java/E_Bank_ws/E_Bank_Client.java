/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_Bank_ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Suwadith
 */
@WebService(serviceName = "E_Bank_Client")
public class E_Bank_Client {
    
    private static Connection conn = null;
    private static Statement stmt = null;
    

    private Connection makeConnection() throws SQLException {
        if (conn == null) {
            new com.mysql.jdbc.Driver();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/e_bank", "root", "");
        }
        return conn;
    }
    
    public boolean registerClient(String name, String dob, String address, int mobile, String e_mail, 
            int account_number, String account_type, String sort_code, int balance, String card) {
        boolean flag=false;
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }
        //check whether the account is a joint account
        if(account_type.equalsIgnoreCase("joint")){
            try {
                String sql = "INSERT INTO client_details(name, dob, address, mobile, e_mail, account_number, "
                        + "account_type, sort_code, balance, card) "
                        + "VALUES('" + name + "','" + dob + "','" + address + "','" + mobile + "','" + e_mail 
                        + "','" + account_number + "','" + account_type + "','" + sort_code + "','" + balance + "','" + card + "')";
                stmt = conn.createStatement();
                int rs = stmt.executeUpdate(sql);
                if(rs==1){
                    flag=true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }else{
            //if the account is not a joint account then search for a available account number. 
            //If there isn't any make one
            try{
                String sql = "SELECT * FROM client_details WHERE account_number='"+account_number+"'";
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()){

                }else{
                    try {
                        String sql1 = "INSERT INTO client_details(name, dob, address, mobile, e_mail, account_number, "
                                + "account_type, sort_code, balance, card) "
                                + "VALUES('" + name + "','" + dob + "','" + address + "','" + mobile + "','" + e_mail 
                                + "','" + account_number + "','" + account_type + "','" + sort_code + "','" + balance + "','" + card + "')";
                        stmt = conn.createStatement();
                        int rs1 = stmt.executeUpdate(sql1);
                        if(rs1==1){
                            flag=true;
                        }

                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return flag;
    }

    public boolean editClient(String name, String dob, String address, int mobile, String e_mail, 
            int account_number, String account_type, String sort_code, int balance, String card) {
        boolean flag=false;
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }

        try {
            String sql = "UPDATE client_details SET name='" + name + "', dob='" + dob + "', address='" 
                    + address + "', mobile='" + mobile + "', e_mail='" + e_mail + "', account_number='" 
                    + account_number + "', account_type='" + account_type + "', sort_code='" + sort_code 
                    + "', balance='" + balance + "', card='" + card + "' WHERE e_mail='" + e_mail+"' AND account_number='" 
                    + account_number+"'";
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
    
    public boolean deleteClient(int account_number, String e_mail) {
        boolean flag=false;
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }
        
        try{
            String sql = "DELETE FROM client_details WHERE account_number='"+account_number+"' AND e_mail='"+e_mail+"'";
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
    
    public ArrayList<String> displayClientList() {
        ArrayList<String> strArray=null;
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }
        
        try{
            String sql = "SELECT * FROM client_details";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            strArray=new ArrayList<>();
            while(rs.next()){
                strArray.add(rs.getString("name") + ":" +rs.getString("account_number")+ ":" +rs.getString("e_mail"));
                
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return strArray;
    }
    
    /*Developed by Raveen S Rathnayake */
    public String[] loadClient(int account_number, String e_mail) {
        String[] array=null;
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }
        
        try{
            String sql = "SELECT name, dob, address, mobile, e_mail, account_number, "
                    + "account_type, sort_code, balance, card FROM client_details WHERE account_number='"+account_number+"' AND e_mail='"+e_mail+"' ";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                array=new String[10];
                array[0]=rs.getString("name");
                array[1]=rs.getString("dob");
                array[2]=rs.getString("address");
                array[3]=rs.getString("mobile");
                array[4]=rs.getString("e_mail");
                array[5]=rs.getString("account_number");
                array[6]=rs.getString("account_type");
                array[7]=rs.getString("sort_code");
                array[8]=rs.getString("balance");
                array[9]=rs.getString("card");
            } 
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return array;
    }
    
}
