/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registeractivity;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author caria
 */
public class SQLConnect {
      static Connection con;
    public static Connection SQLConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:///dbregister", "root", "");
            System.out.println("Connected!");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return con;
    }
    public static void main(String[] args) {
        new SQLConnect();
    }
}
