package com.ii.shooldemo.wode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ii.shooldemo.ModuleActivity;
import com.ii.shooldemo.R;

public class wode extends AppCompatActivity {

    String name ="";
    String zhuanye ="";
    String nianji ="";
    int i = 0;

//    public wode(String name , String zhuanye, String nianji , int i){
//        this.name = name;
//        this.zhuanye = zhuanye;
//        this.nianji = nianji;
//        this.i = i;
//    }


//    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wode);

        wodest wodest = new wodest();
        this.name = wodest.getName();
        this.zhuanye = wodest.getZhuanye();
        this.nianji = wodest.getNianji();
        this.i = wodest.getI();


        Button dinggou = findViewById(R.id.queding);
        dinggou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//确定点击事件
                Toast.makeText(wode.this,"修改成功",Toast.LENGTH_SHORT).show();
                TextView t1 = findViewById(R.id.name);//姓名
                TextView t2 = findViewById(R.id.age);//年龄
                TextView t3 = findViewById(R.id.zhuanye);//专业
                TextView t4 = findViewById(R.id.sex);//性别
                TextView t5 = findViewById(R.id.xueli);//学历
                TextView t6 = findViewById(R.id.dangji);//党籍

                //实体类  传值
                new wodestff(t1.getText().toString(),t2.getText().toString(),t3.getText().toString(),
                        t4.getText().toString(),t5.getText().toString(),t6.getText().toString(),1);


                //跳转页面
                Intent intent = new Intent(wode.this, ModuleActivity.class);
                startActivity(intent);

            }
        });

    }
}
