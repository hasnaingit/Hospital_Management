/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin_area;

import java.sql.*;

/**
 *
 * @author User
 */
public class DBConnection {

    public static Connection getDBConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "123");
        } catch (Exception e) {
        }
        return con;
    }
}
