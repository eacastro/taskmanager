/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nosside.taskmanager.service;

import com.nosside.taskmanager.model.Task;
import com.nosside.taskmanager.DAO.TaskDAO;

/**
 *
 * @author ediss
 */
public class TaskService {

    public static void createTask() {
        Task myTaskToCreate = new Task();
        myTaskToCreate.setTitle("Alimentar al gato");
        myTaskToCreate.setDescription("Servir dos tazas de concentrado en el recipiente");

        TaskDAO myTaskDAO = new TaskDAO();
        myTaskDAO.createTask(myTaskToCreate);

    }
}
