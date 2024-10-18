package com.java.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.java.model.CustomerDetail;
import com.java.model.Detail;
import com.java.model.ResponseM;
import com.java.model.ResponseModel;
import com.java.service.ProcessCustomerDetail;

import java.sql.SQLException;

public class CustomerMains {

    public String processRequest(String request) throws SQLException {
        Gson gson = new Gson();
        String response = "";

        JsonObject jsonObject = JsonParser.parseString(request).getAsJsonObject();
        String screenValue = jsonObject.get("screen").getAsString();

        //  String screen = customerDetail.getScreen();
       // String screen = detail.getScreen();

        ProcessCustomerDetail processCutomerDetail = new ProcessCustomerDetail();

        switch (screenValue) {
            case "CustomerDetail":
                CustomerDetail customerDetail = gson.fromJson(request, CustomerDetail.class);
                ResponseModel responseModel = processCutomerDetail.customerDetail(customerDetail);
                response = gson.toJson(responseModel);
                break;
            case "IdDetails":
                Detail detail = gson.fromJson(request, Detail.class);
                ResponseM responseM = processCutomerDetail.detail(detail);
                response = gson.toJson(responseM);
                break;
            default:
                response ="No endpoints gets";
                break;
        }
        return response ;
    }

    public static void main(String[] args) throws SQLException {
     /*   String requet = "{\n" +
                "  \"primaryPhone\": \"+9134545878723\",\n" +
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
                "}";*/

        String request = "{\n" +
                "  \"primaryPhone\": \"+913456787233\",\n" +
                "  \"accuracy\": 10,\n" +
                "  \"customerName\": \"Suraj Kamble\",\n" +
                "  \"screen\": \"IdDetails\",\n" +
                "  \"nationalIdImage\": \"UUID\",\n" +
                "  \"customerIdNumber\": \"3456787656\",\n" +
                "  \"assessmentId\": 32\n" +
                "}";


        CustomerMains customerMain = new CustomerMains();
        String response = customerMain.processRequest(request);
        System.out.println(response);

        System.out.println("Done process....");
    }

}
