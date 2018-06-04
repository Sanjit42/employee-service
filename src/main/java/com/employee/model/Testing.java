package com.employee.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "testing_skills")
public class Testing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    @Size(min = 5, max = 5)
    private int employeeId;

    @NotBlank
    @Size(min = 1, max = 1)
    private int capybara;

    @NotBlank
    @Size(min = 1, max = 1)
    private int cucumber;

    @NotBlank
    @Size(min = 1, max = 1)
    private int fitnesse;

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

    public int getCapybara() {
        return capybara;
    }

    public void setCapybara(int capybara) {
        this.capybara = capybara;
    }

    public int getCucumber() {
        return cucumber;
    }

    public void setCucumber(int cucumber) {
        this.cucumber = cucumber;
    }

    public int getFitnesse() {
        return fitnesse;
    }

    public void setFitnesse(int fitnesse) {
        this.fitnesse = fitnesse;
    }
}
