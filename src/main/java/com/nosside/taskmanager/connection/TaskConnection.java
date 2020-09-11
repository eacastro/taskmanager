/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nosside.taskmanager.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ediss
 */
public class TaskConnection {
    private Connection connection;
    
    private TaskConnection() {
        String url = "jdbc:mysql://localhost:3306/taskmanager";
        
        try {
            connection = DriverManager.getConnection(url, "root", "");
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public static TaskConnection getInstance() {
        return new TaskConnection();
    }
    
    public Connection getConnection() {
        return connection;
    }
}
