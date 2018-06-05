package com.employee.model;

import javax.persistence.Embeddable;

@Embeddable
public class ProjectExperience {

    private String project;
    private String subProject;
    private String projectStartDate;
    private String projectToDate;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getSubProject() {
        return subProject;
    }

    public void setSubProject(String subject) {
        this.subProject = subject;
    }

    public String getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(String from) {
        this.projectStartDate = from;
    }

    public String getProjectToDate() {
        return projectToDate;
    }

    public void setProjectToDate(String to) {
        this.projectToDate = to;
    }
}
