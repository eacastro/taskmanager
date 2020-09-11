/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nosside.taskmanager.service;

import com.nosside.taskmanager.model.Task;
import com.nosside.taskmanager.DAO.TaskDAO;
import com.nosside.taskmanager.TaskCommandInterface;
import com.nosside.taskmanager.model.OperationResult;

/**
 *
 * @author ediss
 */
public class TaskService {

    public static void createTask(String title, String description) {
        Task myTaskToCreate = new Task();
        OperationResult createResult;        
        
        myTaskToCreate.setTitle(title);
        myTaskToCreate.setDescription(description);

        TaskDAO myTaskDAO = new TaskDAO();
        createResult = myTaskDAO.createTask(myTaskToCreate);
        displayFetchedResult(createResult);
    }
    
    private static void displayFetchedResult(OperationResult result) {
        TaskCommandInterface outputInterface = new TaskCommandInterface();
        
        if (result.isError()) {
            outputInterface.showErrorMessage(result.getDescriptionResult());
        } else {
            outputInterface.showSuccessMessage(result.getDescriptionResult());
        }
    }
    
    
}
