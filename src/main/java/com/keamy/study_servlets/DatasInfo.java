package com.keamy.study_servlets;

import java.util.ArrayList;
import java.util.HashMap;

import com.keamy.study_servlets.beans.MemberBean;

public class DatasInfo {
    public HashMap<String, String> getSearchformData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key","Search Title");
        searchForm.put("name","은원기");
        searchForm.put("id","ID0001");
        return searchForm;
    }

    public ArrayList<String> getTablesListWithString(){
        ArrayList<String> tablesListWithString = new ArrayList<>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");
        return tablesListWithString;
    }

    public HashMap<String, Object> getBundlesData() {
        DatasInfo datasInfo = new DatasInfo();
        HashMap<String, String> searchForm = datasInfo.getSearchformData();
        ArrayList<String> tablesListWithString = datasInfo.getTablesListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);
        return bundlesData;
    } 

    public MemberBean getDataWithMemberBean(){
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");
        
        return memberBean;
    }
}
