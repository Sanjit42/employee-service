package com.employee.model;

import javax.persistence.*;

@Entity
@Table(name = "skillsAndAbilities")
public class SkillsAndAbilities {

    @Id
    @Column(name = "skills_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer skillsId;

    @Column(unique = true)
    private int employeeId;

    private Domain domain;
    private Testing testing;
    private Technical technical;
    private Consulting consulting;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public Testing getTesting() {
        return testing;
    }

    public void setTesting(Testing testing) {
        this.testing = testing;
    }

    public Technical getTechnical() {
        return technical;
    }

    public void setTechnical(Technical technical) {
        this.technical = technical;
    }

    public Consulting getConsulting() {
        return consulting;
    }

    public void setConsulting(Consulting consulting) {
        this.consulting = consulting;
    }

    public Integer getSkillsId() {
        return skillsId;
    }

    public void setSkillsId(Integer skillsId) {
        this.skillsId = skillsId;
    }
}
