/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nosside.taskmanager;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ediss
 */
public class TaskCommandInterface {

    public void showEntryMessage() {
        System.out.println("Welcome to TaskManager!");
    }

    public void showMenu() {
        System.out.println("To get started, please choose an option:");
        System.out.println("1 - Create a new task to do");
        waitForResponse();
    }

    public void waitForResponse() {
        int userResponse = 0;

        try {
            userResponse = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Error: You haven't entered a number"
                    + " (" + e.getMessage() + ")"
            );
        }
        checkOption(userResponse);
    }

    public String requireTaskTitle() {
        System.out.println("Please introduce the title of your task");
        return new Scanner(System.in).nextLine();
    }

    public String requireTaskDescription() {
        System.out.println("Please, type the description of your task");
        return new Scanner(System.in).nextLine();
    }

    private void checkOption(int option) {
        switch (option) {
            case 1:
                requireTaskInfo();
                break;

        }
    }

    private void requireTaskInfo() {
        String title = requireTaskTitle();
        String description = requireTaskDescription();
    }
}
