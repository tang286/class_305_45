package com.ii.shooldemo.wode;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ii.shooldemo.R;
import com.ii.shooldemo.shuji.ShuJi;

public class FirstFragment_wode extends Fragment {
    private androidx.fragment.app.FragmentManager fragmentManager;

    String name = "";
    String age = "";
    String zhuanye = "";
    String sex = "";
    String xueli = "";
    String dangji = "";
    int i = 0;

    public FirstFragment_wode(){
        //实体类  获取值
        wodestff wodestff = new wodestff();
        this.name = wodestff.getName();
        this.age = wodestff.getAge();
        this.zhuanye = wodestff.getZhuanye();
        this.sex = wodestff.getSex();
        this.xueli = wodestff.getXueli();
        this.dangji = wodestff.getDangji();
        this.i = wodestff.getI();
    }
//    public FirstFragment_wode(String name ,String age,String zhuanye,String sex,String xueli,String dangji,int i){
//        this.name = name;
//        this.age = age;
//        this.zhuanye = zhuanye;
//        this.sex = sex;
//        this.xueli = xueli;
//        this.dangji = dangji;
//        this.i = i;
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.first_fragment_wode,container,false);



        if(i == 1){//初始不执行
            TextView name = view.findViewById(R.id.name);
            name.setText(this.name);
            TextView age = view.findViewById(R.id.age);
            age.setText(this.age);
            TextView zhuanye = view.findViewById(R.id.zhuanye);
            zhuanye.setText(this.zhuanye);
            TextView sex = view.findViewById(R.id.sex);
            sex.setText(this.sex);
            TextView xueli = view.findViewById(R.id.xueli);
            xueli.setText(this.xueli);
            TextView dangji = view.findViewById(R.id.dangji);
            dangji.setText(this.dangji);
        }

//        修改基本信息 按钮
        Button xg = view.findViewById(R.id.xiugai1);
        xg.setOnClickListener(new View.OnClickListener() {//修改的点击事件
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wode.class);//跳转到修改信息页面
                startActivity(intent);
            }
        });
        return view;
    }
}