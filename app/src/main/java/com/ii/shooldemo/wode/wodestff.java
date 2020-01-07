package com.ii.shooldemo.wode;

public class wodestff {

    static String name = "";
    static  String age = "";
    static String zhuanye = "";
    static String sex = "";
    static String xueli = "";
    static String dangji = "";
    static int i = 0;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    public String getDangji() {
        return dangji;
    }

    public void setDangji(String dangji) {
        this.dangji = dangji;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }



    public wodestff(){

    }
    public wodestff(String name ,String age,String zhuanye,String sex,String xueli,String dangji,int i){
        this.name = name;
        this.age = age;
        this.zhuanye = zhuanye;
        this.sex = sex;
        this.xueli = xueli;
        this.dangji = dangji;
        this.i = i;
    }
}
