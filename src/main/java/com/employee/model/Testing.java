package com.employee.model;

import javax.persistence.*;

@Embeddable
public class Testing {

    private int capybara;
    private int cucumber;
    private int fitnesse;

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
