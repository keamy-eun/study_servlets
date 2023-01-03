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
        String query = "SELECT * FROM QUESTIONS_LIST;";
        ResultSet resultSet = statement.executeQuery(query);
        ArrayList<HashMap<String, Object>> arrayUserList = new ArrayList<HashMap<String, Object>>();
        while(resultSet.next()){
            HashMap<String, Object> userList= new HashMap<String, Object>();
            userList.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
            userList.put("QUESTIONS", resultSet.getString("QUESTIONS"));
            userList.put("ORDERS", resultSet.getString("ORDERS"));
            arrayUserList.add(userList);
            System.out.println("UserList 실행됨");
        }
        return arrayUserList;
    }
}
