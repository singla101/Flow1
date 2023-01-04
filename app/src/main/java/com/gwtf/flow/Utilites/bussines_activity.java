package com.gwtf.flow.Utilites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.gwtf.flow.R;
import com.gwtf.flow.adapter.slider_adapter;

import java.util.ArrayList;
import java.util.List;

public class bussines_activity extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bussines);
//        setContentView(R.layout.activity_bussiness_card);
        viewPager=findViewById(R.id.viewPager);
        List<Integer> imageList= new ArrayList<>();
        imageList.add(R.drawable.firstdesign);
        imageList.add(R.drawable.seconddesign);
        imageList.add(R.drawable.sixthdesign);
        imageList.add(R.drawable.fifthdesign);
        imageList.add(R.drawable.fourthdesign);
        imageList.add(R.drawable.thirddesign);



        slider_adapter slide= new slider_adapter(imageList);
        viewPager.setAdapter(slide);
    }
}