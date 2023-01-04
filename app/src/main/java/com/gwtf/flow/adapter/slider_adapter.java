package com.gwtf.flow.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.gwtf.flow.R;

import java.util.List;

public class slider_adapter extends PagerAdapter{



    List<Integer> list;

    public slider_adapter(List<Integer> imageList){
        this.list=imageList;
    }
        @Override
    public int getCount() {
                return list.size();
        }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view= LayoutInflater.from(container.getContext()).inflate(R.layout.image_layout,container, false);
        ImageView image=view.findViewById(R.id.imagesview);
        image.setImageResource(list.get(position));
        container.addView(view);
        return view;
    }

//    private int getImagesview() {
//        return R.id.imagesview;
//    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
//        super.destroyItem(container, position, object);
    }
}
