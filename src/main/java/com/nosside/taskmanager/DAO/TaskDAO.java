/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nosside.taskmanager.DAO;

import com.nosside.taskmanager.connection.TaskConnection;
import com.nosside.taskmanager.model.OperationResult;
import com.nosside.taskmanager.model.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Edisson Castro
 */
public class TaskDAO {
    private final TaskConnection databaseConnection = TaskConnection.getInstance();
    
    // Create
    public void createTask(Task task) {
        int rowsAffected = 0;
        OperationResult opRes = new OperationResult();
        
        try (Connection sqlConnection = databaseConnection.getConnection()) {
            PreparedStatement ps = sqlConnection.prepareStatement("INSERT INTO task(title, description) VALUES(?, ?)");
            ps.setString(1, task.getTitle());
            ps.setString(2, task.getDescription());
            rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage() );
        }
        
        if (rowsAffected > 0) {
            opRes.setError(false);
            opRes.setDescriptionResult("The task was created successfully");
        } else {
            opRes.setError(true);
            opRes.setDescriptionResult("It wasn't possible create your task");
        }
    }
    
    // Read
    public void fetchTask(Task task) {
        
    }
    
    // Update
    public void modifyTask(Task task) {
        
    }
    
    // Delete
    public void deleteTask(Task task) {
        
    }
    
    
    
    
}
