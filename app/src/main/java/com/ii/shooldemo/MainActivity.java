package com.ii.shooldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ii.shooldemo.database.data;
import com.ii.shooldemo.student.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 主方法
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        SCREEN_ORIENTATION_BEHIND	继承Activity堆栈中当前Activity下面的那个Activity的方向
//        SCREEN_ORIENTATION_FULL_SENSOR	由重力传感器决定0/90/180/270°
//        SCREEN_ORIENTATION_FULL_USER
//        SCREEN_ORIENTATION_LANDSCAPE	始终横屏
//        SCREEN_ORIENTATION_PORTRAIT	始终竖屏
//        SCREEN_ORIENTATION_LOCKED	锁定屏幕方向
//        SCREEN_ORIENTATION_NOSENSOR	关闭重力传感器对横/竖屏的影响
//        SCREEN_ORIENTATION_REVERSE_LANDSCAPE	另一个方向的横屏
//        SCREEN_ORIENTATION_REVERSE_PORTRAIT	另一个方向的竖屏（倒拿手机）
//        SCREEN_ORIENTATION_SENSOR	重力传感器影响屏幕的方向0/90/270°
//        SCREEN_ORIENTATION_SENSOR_LANDSCAPE	始终横屏，由重力传感器决定是哪个方向的横屏
//        SCREEN_ORIENTATION_SENSOR_PORTRAIT	始终竖屏，由重力传感器决定是哪个方向的竖屏
//        SCREEN_ORIENTATION_UNSPECIFIED	不指定方向，使用默认方向
//        SCREEN_ORIENTATION_USER	由用户和重力传感器共同决定，详见文本末端
//        SCREEN_ORIENTATION_USER_LANDSCAPE	用户和重力传感器共同决定是哪个方向的横屏
//        SCREEN_ORIENTATION_USER_PORTRAIT	用户和重力传感器共同决定是哪个方向的竖屏
//        UIOPTION_SPLIT_ACTION_BAR_WHEN_NARROW	当屏幕较窄时导航栏有一部分会显示在底部

        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
        setContentView(R.layout.activity_main);//初始化页面
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//设定为竖屏
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//设定为横屏
        data data = new data();
        List<Map> list = new ArrayList<>();
        List<Map> list1 = new ArrayList<>();
        List<Map> list2 = new ArrayList<>();
        for(int i = 0 ;i <10 ; i++){
            Map map = new HashMap<>();
            map.put("name","学生"+String.valueOf(i));
            map.put("uuid",String.valueOf(i));
            map.put("zh","12"+String.valueOf(i));//账号
            map.put("mm","123");//密码
            map.put("type","1");//1是学生  2是老师
//            data.setXsMap(map);//学生
            list.add(map);
        }
        data.setXsList(list);

        for(int i = 0 ;i <10 ; i++){
            Map map = new HashMap<>();
            map.put("name","老师"+String.valueOf(i));
            map.put("uuid",String.valueOf(i));
            map.put("zh","adminl"+String.valueOf(i));//账号
            map.put("mm","123");//密码
            map.put("type","2");//1是学生  2是老师
            list1.add(map);
//            data.setLsMap(map);//老师

//            data.lsList.add(map);
        }
        data.setLsList(list1);

        for(int i = 0 ;i <4 ; i++){
            Map map = new HashMap<>();
            map.put("name","学生"+String.valueOf(i));
            map.put("uuid","家教");
            map.put("zh","adminl"+String.valueOf(i));//账号
            map.put("mm","123");//密码
            map.put("type","2");//1是学生  2是老师
            list2.add(map);
//            data.setLsMap(map);//老师
//            data.lsList.add(map);
        }
        for(int i = 4 ;i <8 ; i++){
            Map map = new HashMap<>();
            map.put("name","学生"+String.valueOf(i));
            map.put("uuid","正在申请");
            map.put("zh","adminl"+String.valueOf(i));//账号
            map.put("mm","123");//密码
            map.put("type","2");//1是学生  2是老师
            list2.add(map);
//            data.setLsMap(map);//老师

//            data.lsList.add(map);
        }
        data.setJjList(list2);

        final List<Map> ls = data.getLsList();//老师
        final List<Map> xs = data.getXsList();//学生

        Button button = findViewById(R.id.btn_login);//获取资源
        button.setOnClickListener(new View.OnClickListener() {//点击事件
            @Override
            public void onClick(View view){
                EditText etu = findViewById(R.id.et_number);
                EditText etp = findViewById(R.id.et_password);
                String username = etu.getText().toString();//账号
                String password = etp.getText().toString();//密码

//                if(username.equals("123") && password.equals("123")){
////                    HashMap map = new HashMap();
//
////                    new data(map);
//                    Intent intent = new Intent(MainActivity.this, ModuleActivity.class);//实例要跳转的页面
//                    startActivity(intent);//启动要跳转的页面
//                    return;
//                }
                for(Map map : ls){
                    if(username.equals(map.get("zh").toString()) && password.equals(map.get("mm").toString())){
                        new data(map);
                        Intent intent = new Intent(MainActivity.this, ModuleActivity.class);//实例要跳转的页面
                        startActivity(intent);//启动要跳转的页面
                        return;
                    }
                }

                for(Map map : xs){
                    if(username.equals(map.get("zh").toString()) && password.equals(map.get("mm").toString())){
                        new data(map);
                        Intent intent = new Intent(MainActivity.this, ModuleActivity.class);//实例要跳转的页面
                        startActivity(intent);//启动要跳转的页面
                        return;
                    }
                }

            }
        });
    }
}
