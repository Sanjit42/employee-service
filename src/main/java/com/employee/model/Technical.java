package com.employee.model;

import javax.persistence.Embeddable;

@Embeddable
public class Technical {

    private int java;
    private int aws;

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
}
