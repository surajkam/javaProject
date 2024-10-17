package com.java.controller;

import com.google.gson.Gson;
import com.java.model.CustomerDetail;
import com.java.service.ProcessCustomerDetail;

public class CustomerMain {

    public String processRequest(String request) {
        Gson gson = new Gson();

        CustomerDetail customerDetail = gson.fromJson(request, CustomerDetail.class);
        String screen = customerDetail.getScreen();
        switch (screen) {
            case "CustomerDetail":
                ProcessCustomerDetail processCutomerDetail = new ProcessCustomerDetail();
                CustomerDetail response = processCutomerDetail.customerDetail(customerDetail);
                break;

            default:

                break;
        }
        return "";
    }

    public static void main(String[] args) {
        String requet="{\n" +
                "  \"primaryPhone\": \"+91345678723\",\n" +
                "  \"alternatePhone\": \"23456745678\",\n" +
                "  \"latitude\": 20.345678,\n" +
                "  \"longitude\": -12.34567,\n" +
                "  \"accuracy\": 10,\n" +
                "  \"customerName\": \"Suraj Kamble\",\n" +
                "  \"installerId\": 6,\n" +
                "  \"customerImage\": \"UUID\",\n" +
                "  \"customerIdType\": \"PAN Card\",\n" +
                "  \"screen\": \"CustomerDetail\",\n" +
                "  \"nationalIdImage\": \"UUID\",\n" +
                "  \"customerIdNumber\": \"3456787656\",\n" +
                "  \"assessmentId\": 32,\n" +
                "  \"customerAssessments\": {\n" +
                "    \"bankDetails\": {\n" +
                "      \"IFSC\": \"0000NKS\",\n" +
                "      \"accountNumber\": \"23456784567\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
        CustomerMain customerMain=new CustomerMain();
        String s = customerMain.processRequest(requet);
        System.out.println("Done process....");
    }
}
