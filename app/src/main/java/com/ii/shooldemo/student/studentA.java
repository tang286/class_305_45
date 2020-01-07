package com.ii.shooldemo.student;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.ii.shooldemo.FirstFragment;
import com.ii.shooldemo.R;

import java.util.List;

public class studentA extends ArrayAdapter<student> {
    private int resourceId;

    //将上下文、ListView子项布局的id、数据 传递进来
    public studentA(Context context, int textViewResourceId, List<student> obj){
        super(context, textViewResourceId, obj);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        student student = getItem(position);//获取当前项的Weather实例
        //LayoutInflater的inflate()方法接收3个参数：需要实例化布局资源的id、ViewGroup类型视图组对象、false
        //false表示只让父布局中声明的layout属性生效，但不会为这个view添加父布局
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        //获取实例
//        ImageView image = (ImageView) view.findViewById(R.id.image1);
        TextView name = (TextView) view.findViewById(R.id.name1);
        TextView uuid = (TextView) view.findViewById(R.id.uuid);
        //设置图片和文字
//        image.setImageResource(student.getImageId());
        name.setText(student.getName());
        uuid.setText(student.getUuid());
        return view;
    }

}
