package com.ii.shooldemo.database;

import com.ii.shooldemo.student.student;

import java.util.List;
import java.util.Map;

public final class data {

    public static List<Map> lsList;//多个老师的基本信息
    public static List<Map> xsList;//多个 学生 的 基本信息
    public static List<Map> jjList;//家教

    public static Map xsMap;//学生基本信息
    public static Map lsMap;//老师基本信息
    public static Map jbList;//登录人的基本信息
    public static student stu;//

    public static Map getJbList() {
        return jbList;
    }

    public static void setJbList(Map jbList) {
        data.jbList = jbList;
    }

    public student getStu() {
        return stu;
    }

    public void setStu(student stu) {
        this.stu = stu;
    }



    public data(Map jbLis){
        this.jbList = jbLis;
    }

    public data(){

    }

    public List<Map> getLsList() {
        return lsList;
    }

    public void setLsList(List<Map> lsList) {
        this.lsList = lsList;
    }

    public List<Map> getXsList() {
        return xsList;
    }

    public void setXsList(List<Map> xsList) {
        this.xsList = xsList;
    }
    public List<Map> getJjList() {
        return jjList;
    }

    public void setJjList(List<Map> jjList) {
        this.jjList = jjList;
    }

    public Map getXsMap() {
        return xsMap;
    }

    public void setXsMap(Map xsMap) {
        this.xsMap = xsMap;
        this.xsList.add(xsMap);
    }

    public Map getLsMap() {
        return lsMap;
    }

    public void setLsMap(Map lsMap) {
        this.lsMap = lsMap;
        this.lsList.add(lsMap);
    }



}
