package com.ii.shooldemo.shuji;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ii.shooldemo.R;
import com.ii.shooldemo.xiugai.studengXG;

public class FirstFragment_shuji extends Fragment {
    private androidx.fragment.app.FragmentManager fragmentManager;
    public FirstFragment_shuji(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.first_fragment_shu,container,false);

        LinearLayout stu1 = (LinearLayout) view.findViewById(R.id.stu1);
        LinearLayout stu2 = (LinearLayout) view.findViewById(R.id.stu2);
        LinearLayout stu3 = (LinearLayout) view.findViewById(R.id.stu3);


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
                new shujist(s,s1,s2,1);
                Intent intent = new Intent(getActivity(), ShuJi.class);//Intent intent = new Intent(FirstFragment_shuji.this, ShuJi.class);
                startActivity(intent);
            }
        });
        stu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = view.findViewById(R.id.img2);
                TextView name = view.findViewById(R.id.stuname2);
                TextView zhuanye = view.findViewById(R.id.stuzhuanye2);
                TextView nianji = view.findViewById(R.id.stunianji2);

//                img1.setImageDrawable(getResources().getDrawable(R.drawable.a));//设置图片
                String s = name.getText().toString();
                String s1 = zhuanye.getText().toString();
                String s2 = nianji.getText().toString();
                new shujist(s,s1,s2,2);
                Intent intent = new Intent(getActivity(), ShuJi.class);
                startActivity(intent);
            }
        });
        stu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = view.findViewById(R.id.img3);
                TextView name = view.findViewById(R.id.stuname3);
                TextView zhuanye = view.findViewById(R.id.stuzhuanye3);
                TextView nianji = view.findViewById(R.id.stunianji3);

//                img1.setImageDrawable(getResources().getDrawable(R.drawable.a));//设置图片
                String s = name.getText().toString();
                String s1 = zhuanye.getText().toString();
                String s2 = nianji.getText().toString();
                new shujist(s,s1,s2,3);
                Intent intent = new Intent(getActivity(), ShuJi.class);
                startActivity(intent);
            }
        });
        return view;
    }
}