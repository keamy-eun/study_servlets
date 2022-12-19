package com.keamy.study_servlets.beans;

import java.util.ArrayList;
import java.util.HashMap;

public class DataInfors {

    public HashMap<String, Object> getBundlesData() {
        DataInfors datasInfo = new DataInfors();
        HashMap<String, String> searchForm = datasInfo.getSearchformData();
        ArrayList<String> tablesListWithString = datasInfo.getTablesListWithString();
        MemberBean getDataWithMemberBean = datasInfo.getDataWithMemberBean();
        ArrayList<MemberBean> getDataListWithMemberBean = datasInfo.getDataListWithMemberBean();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", datasInfo.getSearchformData());
        bundlesData.put("tablesListWithString", datasInfo.getTablesListWithString());
        bundlesData.put("dataWithMemberBean", datasInfo.getDataWithMemberBean());
        bundlesData.put("dataListWithMemberBean", datasInfo.getDataListWithMemberBean());

        return bundlesData;
    } 

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

    public MemberBean getDataWithMemberBean(){
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");
        
        return memberBean;
    }

    public ArrayList<MemberBean> getDataListWithMemberBean(){
        ArrayList<MemberBean> membersList = new ArrayList<>();

        MemberBean memberBean01 = new MemberBean();
        memberBean01.setFirstName("Mark");
        memberBean01.setSecondName("Otto");
        memberBean01.setHandleName("@mdo");
        membersList.add(memberBean01);

        MemberBean memberBean02 = new MemberBean();
        memberBean02.setFirstName("Cherry");
        memberBean02.setSecondName("Berry");
        memberBean02.setHandleName("Mango");
        membersList.add(memberBean02);

        MemberBean memberBean03 = new MemberBean();
        memberBean03.setFirstName("Bug");
        memberBean03.setSecondName("Animal");
        memberBean03.setHandleName("Fish");
        membersList.add(memberBean03);

        return membersList;
    }
    
}
