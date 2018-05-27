package com.employee.model;

public class Employee {
    private String name;
    private int employeeId;
    private String role;
    private String homeOffice;
    private String currentProject;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getHomeOffice() {
        return homeOffice;
    }

    public void setHomeOffice(String homeOffice) {
        this.homeOffice = homeOffice;
    }

    public String getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(String currentProject) {
        this.currentProject = currentProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}