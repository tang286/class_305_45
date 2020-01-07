package com.ii.shooldemo.xiugai;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ii.shooldemo.R;
import com.ii.shooldemo.myinfo.YueTan;
import com.ii.shooldemo.myinfo.pinqing;
import com.ii.shooldemo.student.yuetanst;
import com.ii.shooldemo.wode.wodest;

public class studengXG extends AppCompatActivity {

    String name ="";
    String zhuanye ="";
    String nianji ="";
    int i = 0;

//    public studengXG(String name ,String zhuanye,String nianji ,int i){
//        this.name = name;
//        this.zhuanye = zhuanye;
//        this.nianji = nianji;
//        this.i = i;
//    }


//    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_xg);

        studentst studentst = new studentst();
        this.name = studentst.getName();
        this.zhuanye = studentst.getZhuanye();
        this.nianji = studentst.getNianji();
        this.i = studentst.getI();

        ImageView img = findViewById(R.id.imgs);
        TextView t = findViewById(R.id.sex);//性别
        TextView t1 = findViewById(R.id.p_2);//名称
        TextView t2 = findViewById(R.id.age);//年龄
        TextView t3 = findViewById(R.id.zhuanye);//专业
        if(i == 1){
            img.setImageDrawable(getResources().getDrawable(R.drawable.a));//设置图片
            t.setText("女");
            t2.setText("18");
            t1.setText(name);
            t3.setText(zhuanye);
        }else if( i == 2){
            img.setImageDrawable(getResources().getDrawable(R.drawable.b));//设置图片
            t.setText("男");
            t2.setText("23");
            t1.setText(name);
            t3.setText(zhuanye);
        }else if( i == 3){
            img.setImageDrawable(getResources().getDrawable(R.drawable.c));//设置图片
            t.setText("女");
            t2.setText("22");
            t1.setText(name);
            t3.setText(zhuanye);
        }else if( i == 4){
            img.setImageDrawable(getResources().getDrawable(R.drawable.d));//设置图片
            t.setText("男");
            t2.setText("23");
            t1.setText(name);
            t3.setText(zhuanye);
        }else if( i == 5){
            img.setImageDrawable(getResources().getDrawable(R.drawable.g));//设置图片
            t.setText("女");
            t2.setText("21");
            t1.setText(name);
            t3.setText(zhuanye);
        }

        Button pq = findViewById(R.id.pinqing1);//聘请
        Button yt = findViewById(R.id.yuetan1);//约谈

        pq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//聘请
                Toast.makeText(studengXG.this,"成功聘请",Toast.LENGTH_SHORT).show();
            }
        });

        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//约谈
                new yuetanst(name,i);
                Intent intent = new Intent(studengXG.this, YueTan.class);
                startActivity(intent);
            }
        });


    }
}
