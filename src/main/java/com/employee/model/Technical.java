package com.employee.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "technical_skill")
public class Technical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    @Size(min = 5, max = 5)
    private int employeeId;

    @NotBlank
    @Size(min = 1, max = 1)
    private int java;

    @NotBlank
    @Size(min = 1, max = 1)
    private int aws;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getAws() {
        return aws;
    }

    public void setAws(int aws) {
        this.aws = aws;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
