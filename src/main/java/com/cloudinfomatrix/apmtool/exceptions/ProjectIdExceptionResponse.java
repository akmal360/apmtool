package com.cloudinfomatrix.apmtool.exceptions;

public class ProjectIdExceptionResponse {
    private String projectIdentifire;

    public ProjectIdExceptionResponse(String projectIdentifire) {
        this.projectIdentifire = projectIdentifire;
    }

    public String getProjectIdentifire() {
        return projectIdentifire;
    }

    public void setProjectIdentifire(String projectIdentifire) {
        this.projectIdentifire = projectIdentifire;
    }
}
