package com.example.viewpager_introscreen;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class IntroViewPagerAdapter extends PagerAdapter {
    Context mContext;
    List<ScreenItem> mScreenItemList;

    public IntroViewPagerAdapter(Context mContext, List<ScreenItem> mScreenItemList) {
        this.mContext = mContext;
        this.mScreenItemList = mScreenItemList;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.layout_screen, null);
        ImageView imgSlider = layoutScreen.findViewById(R.id.introImage);
        TextView title = layoutScreen.findViewById(R.id.introTitle);
        TextView description = layoutScreen.findViewById(R.id.introDescription);

        title.setText(mScreenItemList.get(position).getTitle());
        description.setText(mScreenItemList.get(position).getDescription());
        imgSlider.setImageResource(mScreenItemList.get(position).getScreenImage());
        container.addView(layoutScreen);
        return layoutScreen;


    }

    @Override
    public int getCount() {
        return mScreenItemList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
