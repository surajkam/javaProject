package com.java.controller;

import com.google.gson.Gson;
import com.java.model.CustomerDetail;
import com.java.model.ResponseModel;
import com.java.service.ProcessCustomerDetail;

import java.sql.SQLException;

public class CustomerMain {

    public String processRequest(String request) throws SQLException {

        Gson gson = new Gson();
        String response = "";

        CustomerDetail customerDetail = gson.fromJson(request, CustomerDetail.class);
        String screen = customerDetail.getScreen();
        switch (screen) {
            case "CustomerDetail":
                ProcessCustomerDetail processCutomerDetail = new ProcessCustomerDetail();
               ResponseModel responseModel= processCutomerDetail.customerDetail(customerDetail);
              response =gson.toJson(responseModel);
                break;

            default:

                break;
        }
        return response;
    }

    public static void main(String[] args) throws SQLException {
        String requet="{\n" +
                "  \"primaryPhone\": \"+91345667852\",\n" +
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
        System.out.println(s);
    }
}
