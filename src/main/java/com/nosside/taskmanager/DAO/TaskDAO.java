/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nosside.taskmanager.DAO;

/**
 *
 * @author Edisson Castro
 */
public class TaskDAO {    
    private String title;
    private String description;
    
    public TaskDAO(String taskDescription) {
        description = taskDescription;
    }
    
    public TaskDAO(String taskTitle, String taskDescription) {        
        title = taskTitle;
        description = taskDescription;
    }
    
    // Create
    public void createTask(Task task) {
        
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
