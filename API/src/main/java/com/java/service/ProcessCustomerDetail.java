package com.java.service;

import com.java.model.CustomerDetail;
import com.java.model.ResponseModel;

import java.sql.*;

public class ProcessCustomerDetail {

    public ResponseModel customerDetail(CustomerDetail customerDetail) throws SQLException {
        ResponseModel responseModel = insertData(customerDetail);
        return responseModel;
    }

    public ResponseModel insertData(CustomerDetail customerDetail) throws SQLException {
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResponseModel responseModel=new ResponseModel();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "Mayur@27");
            String sql = "INSERT INTO customer.customer (primary_phone,alternate_phone,latitude,longitude,accuracy,customer_name,installerid,customer_image,customerid_type,nationalid_image,customerid_number,assessmentid,ifsc,account_number)" +
                    " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, customerDetail.getPrimaryPhone());
            preparedStatement.setString(2, customerDetail.getAlternatePhone());
            preparedStatement.setString(3, String.valueOf(customerDetail.getLatitude()));
            preparedStatement.setString(4, String.valueOf(customerDetail.getLongitude()));
            preparedStatement.setString(5, String.valueOf(customerDetail.getAccuracy()));
            preparedStatement.setString(6, customerDetail.getCustomerName());
            preparedStatement.setString(7, String.valueOf(customerDetail.getInstallerId()));
            preparedStatement.setString(8, customerDetail.getCustomerImage());
            preparedStatement.setString(9, customerDetail.getCustomerIdType());
            preparedStatement.setString(10, customerDetail.getNationalIdImage());
            preparedStatement.setString(11, customerDetail.getCustomerIdNumber());
            preparedStatement.setString(12, String.valueOf(customerDetail.getAssessmentId()));
            preparedStatement.setString(13, customerDetail.getCustomerAssessments().getBankDetails().getIFSC());
            preparedStatement.setString(14, customerDetail.getCustomerAssessments().getBankDetails().getAccountNumber());
            int rowAffected = preparedStatement.executeUpdate();

            if (rowAffected > 0) {
                responseModel.setStatus("Success");
                responseModel.setMessage("Details inserted Successfully....");

            } else {
                responseModel.setStatus("Failed");
                responseModel.setMessage("issue getting while inserting details...");

            }
        } catch (Exception e) {
            e.printStackTrace();
            responseModel.setStatus("Failed");
            responseModel.setMessage("issue getting while inserting details...");
        } finally {
            assert con != null;
            con.close();
            assert preparedStatement != null;
            preparedStatement.close();
        }
        return responseModel;
    }
}
