package com.ii.shooldemo.xiugai;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ii.shooldemo.R;
import com.ii.shooldemo.database.data;
import com.ii.shooldemo.student.student;
import com.ii.shooldemo.student.studentA;
import com.ii.shooldemo.student.studentActivity;

import java.util.List;

public class FirstFragment_stu extends Fragment {
    private androidx.fragment.app.FragmentManager fragmentManager;

    public  FirstFragment_stu(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.first_fragment_stu,container,false);

        LinearLayout stu1 = (LinearLayout) view.findViewById(R.id.stu1);
        LinearLayout stu2 = (LinearLayout) view.findViewById(R.id.stu2);
        LinearLayout stu3 = (LinearLayout) view.findViewById(R.id.stu3);
        LinearLayout stu4 = (LinearLayout) view.findViewById(R.id.stu4);
        LinearLayout stu5 = (LinearLayout) view.findViewById(R.id.stu5);

        stu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = view.findViewById(R.id.img1);
                TextView name = view.findViewById(R.id.stuname1);
                TextView zhuanye = view.findViewById(R.id.stuzhuanye1);
                TextView nianji = view.findViewById(R.id.stunianji1);

//                img1.setImageDrawable(getResources().getDrawable(R.drawable.a));//设置图片
                String s = name.getText().toString();
                String s1 = zhuanye.getText().toString();
                String s2 = nianji.getText().toString();
                new studentst(s,s1,s2,1);
                Intent intent = new Intent(getActivity(), studengXG.class);
                startActivity(intent);
            }
        });
        stu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = view.findViewById(R.id.img1);
                TextView name = view.findViewById(R.id.stuname1);
                TextView zhuanye = view.findViewById(R.id.stuzhuanye1);
                TextView nianji = view.findViewById(R.id.stunianji1);

//                img1.setImageDrawable(getResources().getDrawable(R.drawable.a));//设置图片
                String s = name.getText().toString();
                String s1 = zhuanye.getText().toString();
                String s2 = nianji.getText().toString();
                new studentst(s,s1,s2,2);
                Intent intent = new Intent(getActivity(), studengXG.class);
                startActivity(intent);
            }
        });
        stu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = view.findViewById(R.id.img1);
                TextView name = view.findViewById(R.id.stuname1);
                TextView zhuanye = view.findViewById(R.id.stuzhuanye1);
                TextView nianji = view.findViewById(R.id.stunianji1);

//                img1.setImageDrawable(getResources().getDrawable(R.drawable.a));//设置图片
                String s = name.getText().toString();
                String s1 = zhuanye.getText().toString();
                String s2 = nianji.getText().toString();
                new studentst(s,s1,s2,3);
                Intent intent = new Intent(getActivity(), studengXG.class);
                startActivity(intent);
            }
        });
        stu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = view.findViewById(R.id.img1);
                TextView name = view.findViewById(R.id.stuname1);
                TextView zhuanye = view.findViewById(R.id.stuzhuanye1);
                TextView nianji = view.findViewById(R.id.stunianji1);

//                img1.setImageDrawable(getResources().getDrawable(R.drawable.a));//设置图片
                String s = name.getText().toString();
                String s1 = zhuanye.getText().toString();
                String s2 = nianji.getText().toString();
                new studentst(s,s1,s2,4);
                Intent intent = new Intent(getActivity(), studengXG.class);
                startActivity(intent);
            }
        });
        stu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = view.findViewById(R.id.img1);
                TextView name = view.findViewById(R.id.stuname1);
                TextView zhuanye = view.findViewById(R.id.stuzhuanye1);
                TextView nianji = view.findViewById(R.id.stunianji1);

//                img1.setImageDrawable(getResources().getDrawable(R.drawable.a));//设置图片
                String s = name.getText().toString();
                String s1 = zhuanye.getText().toString();
                String s2 = nianji.getText().toString();
                new studentst(s,s1,s2,5);
                Intent intent = new Intent(getActivity(), studengXG.class);
                startActivity(intent);
            }
        });
        return view;
    }
}