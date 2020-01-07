package com.ii.shooldemo.student;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ii.shooldemo.MainActivity;
import com.ii.shooldemo.ModuleActivity;
import com.ii.shooldemo.R;
import com.ii.shooldemo.database.data;
import com.ii.shooldemo.myinfo.JiaJiao;
import com.ii.shooldemo.myinfo.XiuGai;
import com.ii.shooldemo.myinfo.YueTan;
import com.ii.shooldemo.myinfo.pinqing;

public class studentActivity extends AppCompatActivity {

    public student stu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_activity);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//设定为竖屏
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//设定为横屏
        TextView n = findViewById(R.id.name);
        TextView z = findViewById(R.id.zh);
        TextView s = findViewById(R.id.sf);
        Button p = findViewById(R.id.pq);//聘请
        Button y = findViewById(R.id.yt);//约谈
        stu = data.stu;
        System.out.println("6666666666666====="+stu.getName());
        n.setText(stu.getName());
        z.setText(stu.getUuid());
        s.setText(stu.getType());

        if(stu.getType().equals("老师")){
            p.setText("聘请");
            y.setText("约谈");
            //聘请
            p.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(studentActivity.this, pinqing.class);//实例要跳转的页面
                    startActivity(intent);//启动要跳转的页面
//                    Toast.makeText(studentActivity.this,"演示：开始聘请",Toast.LENGTH_SHORT).show();
                }
            });
            //约谈
            y.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(studentActivity.this, YueTan.class);//实例要跳转的页面
                    startActivity(intent);//启动要跳转的页面
//                    Toast.makeText(studentActivity.this,"演示：开始约谈",Toast.LENGTH_SHORT).show();
                }
            });
        }

        if(stu.getType().equals("学生")){
            p.setText("成为家教");
            p.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(studentActivity.this, JiaJiao.class);//实例要跳转的页面
                    startActivity(intent);//启动要跳转的页面

                }
            });
            y.setText("修改");
            y.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(studentActivity.this, XiuGai.class);//实例要跳转的页面
                    startActivity(intent);//启动要跳转的页面

                }
            });
        }

        if(stu.getType().equals("家教")){
            p.setVisibility(View.INVISIBLE);// 设置当前控件隐藏 但仍然占空间
            y.setVisibility(View.INVISIBLE);// 设置当前控件隐藏 但仍然占空间

//            xx.setVisibility(View.INVISIBLE);// 设置当前控件隐藏 但仍然占空间
//            xx.setVisibility(View.GONE);
//            /*
//             * 控件消失 不占空间 需要注意的是 在相对布局中
//             * 若有牵涉到如在此控件的什么方位时要注意该控
//             * 件消失后布局会被打乱
//             */
//            xx.setVisibility(View.VISIBLE);//使控件可见
        }


    }

    public void setdata(student stu){
        this.stu = stu;
    }
}
