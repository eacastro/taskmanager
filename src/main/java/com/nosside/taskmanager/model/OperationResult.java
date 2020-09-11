/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nosside.taskmanager.model;

/**
 *
 * @author ediss
 */
public class OperationResult {
    private boolean error;
    private String descriptionResult;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getDescriptionResult() {
        return descriptionResult;
    }

    public void setDescriptionResult(String descriptionResult) {
        this.descriptionResult = descriptionResult;
    }
    
    
}
