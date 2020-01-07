package com.ii.shooldemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.ii.shooldemo.database.data;
import com.ii.shooldemo.student.student;
import com.ii.shooldemo.student.studentA;
import com.ii.shooldemo.student.studentActivity;

import java.util.List;

public class FirstFragment extends Fragment {
    private androidx.fragment.app.FragmentManager fragmentManager;
    private String context;
    private TextView mTextView;
    private ImageView imageView;
    private List<student> slist;
    private studentA adapter;

    public  FirstFragment(String context){
        this.context = context;
    }
    public  FirstFragment(List<student> slist){
        this.slist = slist;
    }
    public  FirstFragment(studentA adapter){
        this.adapter = adapter;
    }
    public  FirstFragment(studentA adapter,List<student> slist){
        this.adapter = adapter;
        this.slist = slist;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.first_fragment,container,false);


        ListView listView = (ListView) view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                student student = slist.get(i);
                data.stu = student;
                Intent intent = new Intent(getActivity(),studentActivity.class);
                startActivity(intent);
                System.out.println(student.getUuid());

            }
        });
//        mTextView = (TextView)view.findViewById(R.id.txt_content);
//        view.findViewById(R.id.)
//        //mTextView = (TextView)getActivity().findViewById(R.id.txt_content);
//        mTextView.setText(context);

        return view;
    }
}