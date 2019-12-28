/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ConexionBD {
    
        private final String jdbc = "";
    private final String cadena = "jdbc:sqlserver://rodri:1433;databaseName=sistemadeventas";
    private final String user = "";
    private final String pass = "";
    public Connection conn;

    public void abrirConexion() throws Exception {
        try {
            conn = DriverManager.getConnection(cadena, user, pass);
            Class.forName(jdbc);
        } catch (Exception e) {
            throw e;
        }
    }

    public void cerrarConexion() throws SQLException {
        conn.close();
    }
    
    
    
}
