package com.employee.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    @Size(min = 1, max = 100)
    private String name;

    @NotBlank
    @Column(unique = true)
    @Size(min = 5, max = 5)
    private int employeeId;


    @NotBlank
    @Size(min = 2, max = 30)
    private String role;

    @NotBlank
    @Size(min =1, max = 5)
    private String gender;

    @NotBlank
    @Size(min = 2, max = 100)
    private String homeOffice;

    @NotBlank
    @Size(min = 2, max = 100)
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return String.valueOf(id);
    }

    public void setId(Long id) {
        this.id = id;
    }
}