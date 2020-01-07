package com.ii.shooldemo.student;

public class yuetanst {
    static String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    static int i = 0;
    public yuetanst(){

    }
    public yuetanst(String name ,int i ){
        this.name = name;
        this.i = i;
    }
}
