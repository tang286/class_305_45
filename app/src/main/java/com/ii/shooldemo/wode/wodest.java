package com.ii.shooldemo.wode;

public class wodest {
    static String name ="";
    static String zhuanye ="";
    static String nianji ="";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public String getNianji() {
        return nianji;
    }

    public void setNianji(String nianji) {
        this.nianji = nianji;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }


    static int i = 0;
public wodest(){

}
    public wodest(String name , String zhuanye, String nianji , int i){
        this.name = name;
        this.zhuanye = zhuanye;
        this.nianji = nianji;
        this.i = i;
    }
}
