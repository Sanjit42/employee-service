package com.employee.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "consulting_skill")
public class Consulting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    @Size(min = 5, max = 5)
    private int employeeId;

    @NotBlank
    @Size(min = 1, max = 1)
    private int communication;

    @NotBlank
    @Size(min = 1, max = 1)
    private int planning;

    @NotBlank
    @Size(min = 1, max = 1)
    private int questioning;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getCommunication() {
        return communication;
    }

    public void setCommunication(int communication) {
        this.communication = communication;
    }

    public int getPlanning() {
        return planning;
    }

    public void setPlanning(int planning) {
        this.planning = planning;
    }

    public int getQuestioning() {
        return questioning;
    }

    public void setQuestioning(int questioning) {
        this.questioning = questioning;
    }
}
