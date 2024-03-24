package com.example.smallgroup;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        预定义变量

        Button button_Panel = findViewById(R.id.next_button);
        /*
         * 监听创建完成,点击按钮如果被监听到就会执行 onClick() 方法,所以
         * Toast的功能要在onClick()中写.
         * */
        button_Panel.setOnClickListener(v -> {
            /*
             * 我们想要的效果是,弹出一个小小的消息框,几秒钟之后自动消失
             * 构想:一个文本框,一个定时器,一个布局位置.一个显示方法
             * 用静态方法 makeText()创建一个  Toast对象,调用  show()将Toast显示.
             * 说明:   makeText(参数一[Toast要求的上下文  ],    参数二[Toast显示的文本内容],  参数三[Toast显示的时长])
             *   参数一:    Context,由于i活动本身就是一个Context对象,因此直接传入 MainActivity.this
             *   参数二:    内容
             *   参数三:    有两个内置常量 Toast.LENGTH_SHORT    Toast.LENGTH_LONG
             *
             *   引用结束之后记得用   show()方法显示
             * */
            Toast.makeText(MainActivity.this,"鲜衣怒马少年郎，谁人不识理塘王",Toast.LENGTH_SHORT).show();
        });
        Spinner spinner;
        List<String> listForSpinner = new ArrayList<>();
        ArrayAdapter<String> adapterForSpinner;
//        变量初始化
        spinner = findViewById(R.id.spinner);// 引用Spinner控件
//        给字符串数组赋初值
        listForSpinner.add("C语言");
        listForSpinner.add("Python");
        listForSpinner.add("Java");
        listForSpinner.add("C++");
//        设置适配器
        adapterForSpinner = new ArrayAdapter<>(MainActivity.this, R.layout.item_for_custom_spinner, listForSpinner);
        spinner.setAdapter(adapterForSpinner);
    }
}