package com.ii.shooldemo.myinfo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ii.shooldemo.R;
import com.ii.shooldemo.student.studentActivity;

public class JiaJiao extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.jia_jiao);

        Button j = findViewById(R.id.jiajiao1);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JiaJiao.this,"应聘家教成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
