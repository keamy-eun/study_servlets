package com.keamy.study_servlets.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonsGetCon {
    public Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/toy_servletWithDB";
        String user = "root";
        String password = "*khacademy!";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
