package com.employee.model;

import javax.persistence.Embeddable;

@Embeddable
public class LeaveHistory {

    private String leaveType;
    private String leaveFrom;
    private String leaveTo;

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getLeaveFrom() {
        return leaveFrom;
    }

    public void setLeaveFrom(String from) {
        this.leaveFrom = from;
    }

    public String getLeaveTo() {
        return leaveTo;
    }

    public void setLeaveTo(String to) {
        this.leaveTo = to;
    }
}
