package com.ii.shooldemo.myinfo;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ii.shooldemo.R;
import com.ii.shooldemo.student.studentActivity;

public class pinqing extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pinqing);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//设定为竖屏

        Button p = findViewById(R.id.pinqing1);//聘请
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(pinqing.this,"成功聘请",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
