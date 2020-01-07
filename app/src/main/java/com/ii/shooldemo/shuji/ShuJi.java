package com.ii.shooldemo.shuji;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ii.shooldemo.R;

public class ShuJi extends AppCompatActivity {

    String name ="";
    String zhuanye ="";
    String nianji ="";
    int i = 0;

//    public ShuJi(String name , String zhuanye, String nianji , int i){
//        this.name = name;
//        this.zhuanye = zhuanye;
//        this.nianji = nianji;
//        this.i = i;
//    }


//    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shu_ji);

        shujist shujist = new shujist();
        this.name = shujist.getName();
        this.zhuanye = shujist.getZhuanye();
        this.nianji = shujist.getNianji();
        this.i = shujist.getI();


        ImageView img = findViewById(R.id.imgs);
        TextView t1 = findViewById(R.id.name);//书籍
        TextView t2 = findViewById(R.id.jiage);//价格
        TextView t3 = findViewById(R.id.chubanshe);//出版社
        if(i == 1){
            img.setImageDrawable(getResources().getDrawable(R.drawable.yw));//设置图片
            t2.setText("50");
            t1.setText("语文");
            t3.setText("新华书店");
        }else if( i == 2){
            img.setImageDrawable(getResources().getDrawable(R.drawable.sx));//设置图片
            t2.setText("43");
            t1.setText("数学");
            t3.setText("工业书店");
        }else if( i == 3){
            img.setImageDrawable(getResources().getDrawable(R.drawable.yy));//设置图片
            t2.setText("29");
            t1.setText("英语");
            t3.setText("外语书店");
        }

        Button dinggou = findViewById(R.id.dinggou);
        dinggou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ShuJi.this,"订购成功",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
