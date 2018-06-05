package com.employee.model;

import javax.persistence.Embeddable;


@Embeddable
public class Domain {

    private int government;
    private int education;

    public int getGovernment() {
        return government;
    }

    public void setGovernment(int government) {
        this.government = government;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }
}
