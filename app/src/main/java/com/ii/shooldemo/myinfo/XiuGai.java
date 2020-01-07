package com.ii.shooldemo.myinfo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ii.shooldemo.R;
import com.ii.shooldemo.student.studentActivity;

public class XiuGai extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.xiu_gai);

        Button x = findViewById(R.id.xiugai1);


//        x.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//                EditText t1 =  findViewById(R.id.t1);//姓名
//                EditText t2 =  findViewById(R.id.t2);//学历
//                EditText t3 =  findViewById(R.id.t3);//年龄
//                EditText t4 =  findViewById(R.id.t4);//专业
//                EditText t5 =  findViewById(R.id.t5);//是否在读
//                Toast.makeText(XiuGai.this,"修改信息成功-"+"姓名："+t1.getText()+"--"
//                        +"学历："+t2.getText()+"--"
//                                +"年龄："+t3.getText()+"--"
//                                +"专业："+t4.getText()+"--"
//                                +"是否在读："+t5.getText()+""
//                        ,Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
