package com.java.model;

public class ResponseM {

    private String statuses;
    private String messages;
    private String customerNames;
    private String assessmentIds;

    public String getStatuses() {
        return statuses;
    }

    public void setStatuses(String statuses) {
        this.statuses = statuses;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getCustomerNames() {
        return customerNames;
    }

    public void setCustomerNames(String customerNames) {
        this.customerNames = customerNames;
    }

    public String getAssessmentIds() {
        return assessmentIds;
    }

    public void setAssessmentIds(String assessmentIds) {
        this.assessmentIds = assessmentIds;
    }
}
