package com.ii.shooldemo.myinfo;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ii.shooldemo.R;
import com.ii.shooldemo.student.yuetanst;

public class YueTan extends AppCompatActivity {

    String name = "";
    int i = 0;
//
//    public YueTan(String name,int i){
//        this.name = name;
//        this.i = i;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.yue_tan);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//设定为竖屏

        yuetanst yuetanst = new yuetanst();
        this.name = yuetanst.getName();
        this.i = yuetanst.getI();

        TextView p_2 = findViewById(R.id.p_2);
        p_2.setText("与"+name+"交谈中");

        ImageView img= findViewById(R.id.imgy);
        if(i == 1){
            img.setImageDrawable(getResources().getDrawable(R.drawable.a));
        }else if(i == 2){
            img.setImageDrawable(getResources().getDrawable(R.drawable.b));
        }else if(i == 3){
            img.setImageDrawable(getResources().getDrawable(R.drawable.c));
        }else if(i == 4){
            img.setImageDrawable(getResources().getDrawable(R.drawable.d));
        }else if(i == 5){
            img.setImageDrawable(getResources().getDrawable(R.drawable.g));
        }


        final TextView t = findViewById(R.id.ytT);
        Button p = findViewById(R.id.yuetan1);//聘请
        final EditText e = findViewById(R.id.Etextyt);//约谈的输入框
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = e.getText().toString();//约谈的内容
                t.setText(text);//赋值给text框
                e.setText("");
            }
        });
    }
}
