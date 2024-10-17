package com.java.service;

import com.java.model.CustomerDetail;

import java.sql.*;

public class ProcessCustomerDetail {

    public CustomerDetail customerDetail(CustomerDetail customerDetail) {
        insertData(customerDetail);
        return null;
    }

    public void insertData(CustomerDetail customerDetail) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "Mayur@27");
            String sql = "INSERT INTO customer.customer (primary_phone,alternate_phone,latitude,longitude,accuracy,customer_name,installerid,customer_image,customerid_type,nationalid_image,customerid_number,assessmentid,ifsc,account_number)" +
                    " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,customerDetail.getPrimaryPhone() );
            preparedStatement.setString(2,customerDetail.getAlternatePhone() );
            preparedStatement.setString(3, String.valueOf(customerDetail.getLatitude()));
            preparedStatement.setString(4, String.valueOf(customerDetail.getLongitude()));
            preparedStatement.setString(5, String.valueOf(customerDetail.getAccuracy()));
            preparedStatement.setString(6,customerDetail.getCustomerName());
            preparedStatement.setString(7, String.valueOf(customerDetail.getInstallerId()));
            preparedStatement.setString(8, customerDetail.getCustomerImage());
            preparedStatement.setString(9,customerDetail.getCustomerIdType());
            preparedStatement.setString(10,customerDetail.getNationalIdImage());
            preparedStatement.setString(11,customerDetail.getCustomerIdNumber() );
            preparedStatement.setString(12, String.valueOf(customerDetail.getAssessmentId()));
            preparedStatement.setString(13,customerDetail.getCustomerAssessments().getBankDetails().getIFSC());
            preparedStatement.setString(14,customerDetail.getCustomerAssessments().getBankDetails().getAccountNumber());
            preparedStatement.executeUpdate();
            con.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
