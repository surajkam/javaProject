package com.java.model;

public class CustomerDetail {
    private String primaryPhone;

    private String alternatePhone;

    private double latitude;

    private double longitude;

    private int accuracy;

    private String customerName;

    private int installerId;

    private String customerImage;

    private String customerIdType;

    private String screen;

    private String nationalIdImage;

    private String customerIdNumber;

    private int assessmentId;

    private CustomerAssessments customerAssessments;

    public String getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public String getAlternatePhone() {
        return alternatePhone;
    }

    public void setAlternatePhone(String alternatePhone) {
        this.alternatePhone = alternatePhone;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getInstallerId() {
        return installerId;
    }

    public void setInstallerId(int installerId) {
        this.installerId = installerId;
    }

    public String getCustomerImage() {
        return customerImage;
    }

    public void setCustomerImage(String customerImage) {
        this.customerImage = customerImage;
    }

    public String getCustomerIdType() {
        return customerIdType;
    }

    public void setCustomerIdType(String customerIdType) {
        this.customerIdType = customerIdType;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getNationalIdImage() {
        return nationalIdImage;
    }

    public void setNationalIdImage(String nationalIdImage) {
        this.nationalIdImage = nationalIdImage;
    }

    public String getCustomerIdNumber() {
        return customerIdNumber;
    }

    public void setCustomerIdNumber(String customerIdNumber) {
        this.customerIdNumber = customerIdNumber;
    }

    public int getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    public CustomerAssessments getCustomerAssessments() {
        return customerAssessments;
    }

    public void setCustomerAssessments(CustomerAssessments customerAssessments) {
        this.customerAssessments = customerAssessments;
    }

    @Override
    public String toString() {
        return "CustomerDetail{" +
                "primaryPhone='" + primaryPhone + '\'' +
                ", alternatePhone='" + alternatePhone + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", accuracy=" + accuracy +
                ", customerName='" + customerName + '\'' +
                ", installerId=" + installerId +
                ", customerImage='" + customerImage + '\'' +
                ", customerIdType='" + customerIdType + '\'' +
                ", screen='" + screen + '\'' +
                ", nationalIdImage='" + nationalIdImage + '\'' +
                ", customerIdNumber='" + customerIdNumber + '\'' +
                ", assessmentId=" + assessmentId +
                ", customerAssessments=" + customerAssessments +
                '}';
    }
}
