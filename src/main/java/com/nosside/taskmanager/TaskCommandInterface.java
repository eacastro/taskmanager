/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nosside.taskmanager;

import java.util.Scanner;

/**
 *
 * @author ediss
 */
public class TaskCommandInterface {
    private final Scanner sc = new Scanner(System.in);
    
    public String requireTaskTitle() {
        System.out.println("Please introduce the title of your task");
        return sc.nextLine();
    }
}
