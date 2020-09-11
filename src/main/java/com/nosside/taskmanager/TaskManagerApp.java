/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nosside.taskmanager;

import com.nosside.taskmanager.service.TaskService;

/**
 *
 * @author Edisson Castro
 */
public class TaskManagerApp {
    
    public static void main(String args[]) {
        TaskCommandInterface cli = new TaskCommandInterface();
        System.out.println(cli.requireTaskTitle());
        System.out.println(cli.requireTaskDescription());
    }
    
}
