package com.felix.mixview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    //定义一个访问图片的数组
    int [] images = new int[]{
            R.drawable.java,
            R.drawable.javaee,
            R.drawable.swift,
            R.drawable.ajax,
            R.drawable.html
    };
    int currentImg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获得LinearLayout线性布局容器
        LinearLayout myLayout = (LinearLayout)findViewById(R.id.root);

        //代码创建ImageView组件
        final ImageView img = new ImageView(this);

        //设置ImageView组件的宽和高
        img.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));

        //将ImageView组件添加到LinearLayout线性布局容器中
        myLayout.addView(img);

        //初始化第一张图片
        img.setImageResource(images[0]);

        //添加监听事件
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //改变ImageView 里面显示的图片
                img.setImageResource(images[++currentImg % images.length]);
            }
        });
    }
}
