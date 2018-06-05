package com.employee.model;

import javax.persistence.Embeddable;

@Embeddable
public class Consulting {

    private int communication;
    private int planning;
    private int questioning;

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
