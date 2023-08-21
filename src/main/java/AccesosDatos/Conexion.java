/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesosDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 50683
 */
public class Conexion {
    
    
    
    public static Connection getConexion() {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlserver://HENRYTO:1433;database=Deportes;" + "encrypt=true;trustServerCertificate=true", "henry", "12345");
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
}
