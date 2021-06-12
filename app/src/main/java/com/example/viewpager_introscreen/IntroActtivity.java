package com.example.viewpager_introscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IntroActtivity extends AppCompatActivity {
    ViewPager screenviewPager;
    IntroViewPagerAdapter introViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_acttivity);

        //fill list screens
        List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Bimsara","Bimsara Hirushan Pathirana Batch Top",R.drawable.img1));
        mList.add(new ScreenItem("Dushan Bandara","Lankawe Apirisiduma nagaraye jeewath wena thambiyek",R.drawable.img2));
        mList.add(new ScreenItem("Anupa Ranasinghe","Kellonge Sihina Kumaraya namin moku handinweee",R.drawable.img3));

        //setup viewpager
        screenviewPager = findViewById(R.id.screen_view_pager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenviewPager.setAdapter(introViewPagerAdapter);
    }
}