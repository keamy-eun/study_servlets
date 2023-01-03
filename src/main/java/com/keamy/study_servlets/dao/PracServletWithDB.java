package com.keamy.study_servlets.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class PracServletWithDB {
    public ArrayList<HashMap<String, Object>> getUserList() throws SQLException{
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        String query = "SELECT * FROM USERDATA;";
        ResultSet resultSet = statement.executeQuery(query);
        ArrayList<HashMap<String, Object>> arrayUserList = new ArrayList<HashMap<String, Object>>();
        while(resultSet.next()){
            HashMap<String, Object> userList= new HashMap<String, Object>();
            userList.put("USER_UID", resultSet.getString("USER_UID"));
            userList.put("NAME", resultSet.getString("NAME"));
            userList.put("ID", resultSet.getString("ID"));
            userList.put("PASSWORD", resultSet.getString("PASSWORD"));
            userList.put("PHONE_NUMBER", resultSet.getString("PHONE_NUMBER"));
            userList.put("BIRTHDAY", resultSet.getString("BIRTHDAY"));
            userList.put("EMAIL", resultSet.getString("EMAIL"));
            userList.put("SMS_AD", resultSet.getBoolean("SMS_AD"));
            userList.put("EMAIL_AD", resultSet.getBoolean("EMAIL_AD"));
            arrayUserList.add(userList);
            System.out.println("UserList 실행됨");
        }
        return arrayUserList;
    }
}
