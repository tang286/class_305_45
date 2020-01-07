package com.ii.shooldemo;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.ii.shooldemo.database.data;
import com.ii.shooldemo.shuji.FirstFragment_shuji;
import com.ii.shooldemo.student.student;
import com.ii.shooldemo.wode.FirstFragment_wode;
import com.ii.shooldemo.xiugai.FirstFragment_stu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 导航栏类
 */
public class ModuleActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView topBar;
    private TextView tabDeal;
    private TextView tabPoi;
    private TextView tabUser;

    private FrameLayout ly_content;

    private FirstFragment_stu f1; //  学生的 Fragment
    private FirstFragment_shuji f3;//书籍的 Fragment
    private FirstFragment_wode f4;//我的  的 Fragment
    private androidx.fragment.app.FragmentManager fragmentManager;//用这个布局FrameLayout   必须引入这个方法

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.moduleactivity);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//设定为竖屏
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//设定为横屏


        fragmentManager = getSupportFragmentManager();
        bindView();
    }

    //UI组件初始化与事件绑定
    private void bindView() {
        tabDeal = (TextView)this.findViewById(R.id.txt_deal);//学生
        tabPoi = (TextView)this.findViewById(R.id.txt_poi);//老师
        tabUser = (TextView)this.findViewById(R.id.txt_user);//我的
        ly_content = (FrameLayout) findViewById(R.id.fragment_container);//框架的 id

//        设置点击事件
        tabDeal.setOnClickListener(this);
        tabUser.setOnClickListener(this);
        tabPoi.setOnClickListener(this);

    }

    //重置所有文本的选中状态
    public void selected(){
        tabDeal.setSelected(false);//设置 学生导航栏选中状态
        tabPoi.setSelected(false);//设置 资源导航栏选中状态
        tabUser.setSelected(false);//设置 我的导航栏选中状态
    }

    //隐藏所有Fragment
    public void hideAllFragment(FragmentTransaction transaction){
        if(f1!=null){
            transaction.hide(f1);
        }
        if(f3!=null){
            transaction.hide(f3);
        }
        if(f4!=null){
            transaction.hide(f4);
        }
    }

//    private FragmentManager fragmentManager;

    @Override
    public void onClick(View v) {

//        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        FragmentTransaction transaction =  fragmentManager.beginTransaction();//创建事务
        hideAllFragment(transaction);
//        List<student> slist = new ArrayList<>();
        data data = new data();
//        List<Map> lsList = data.getLsList();//老师
//        List<Map> lsList = data.lsList;//资料
//        List<Map> xsList = data.getXsList();//学生
//        List<Map> jjList = data.getJjList();//家教
        switch(v.getId()){
            case R.id.txt_deal://学生
                selected();
                tabDeal.setSelected(true);//导航栏 选中学生
//                int i = 0;
                if(f1==null){
//                    System.out.println(lsList);
//                    for(Map map : lsList){
//                        student student = new student(map.get("name").toString(),i,map.get("uuid").toString(),"老师");
//                        i++;
//                        slist.add(student);
//                    }
//                    for(int i = 0 ; i<6;i++){
//                        student student = new student("名字",i,String.valueOf(i));
//                        slist.add(student);
//                    }
//                    studentA adapter = new studentA(this, R.layout.item_shipin, slist);
                    f1 = new FirstFragment_stu();
                    transaction.add(R.id.fragment_container,f1);//初始化 学生导航栏 上部的布局 （FrameLayout）
//                    if(data.getStu()!=null){
//                        student stu = data.getStu();
//                        Intent intent = new Intent(ModuleActivity.this, studentActivity.class);//实例要跳转的页面
//                        startActivity(intent);//启动要跳转的页面
//                    }
                }else{
                    transaction.show(f1);
                }


                break;

            case R.id.txt_poi://书籍
                selected();//设置导航栏的状态  都变成false
                tabPoi.setSelected(true);
                int ii = 0;
                System.out.println("111");
                if(f3==null){
                    Map m = data.jbList;
                    if(m.get("type").toString().equals("1")){//是学生
//                        System.out.println(m);
//                        for(Map map : xsList){
//                            student student = new student(map.get("name").toString(),ii,map.get("uuid").toString(),"学生");
//                            ii++;
//                            slist.add(student);
//                        }
//                    for(int i = 0 ; i<6;i++){
//                        student student = new student("名字",i,String.valueOf(i));
//                        slist.add(student);
//                    }
//                        studentA adapter = new studentA(this, R.layout.item_shipin, slist);
//                        f3 = new FirstFragment(adapter,slist);
                        f3 = new FirstFragment_shuji();;
                        transaction.add(R.id.fragment_container,f3);
                    }else{
                        Toast.makeText(ModuleActivity.this,"演示：不是学生不可进入",Toast.LENGTH_SHORT).show();
                    }


                }else{
                    transaction.show(f3);
                }
                break;

            case R.id.txt_user://我的
                selected();
                tabUser.setSelected(true);
                int iii = 0;
                if(f4==null){
//                    System.out.println("6====="+jjList);
//                    for(Map map : jjList){
//                        student student = new student(map.get("name").toString(),iii,map.get("uuid").toString(),"家教");
//                        iii++;
//                        slist.add(student);
//                    }
//                    studentA adapter = new studentA(this, R.layout.item_shipin, slist);
//                    f4 = new FirstFragment(adapter,slist);
                    f4 = new FirstFragment_wode();
                    transaction.add(R.id.fragment_container,f4);

                }else{
                    transaction.show(f4);
                }
                break;
        }

        transaction.commit();
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
