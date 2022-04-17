package com.example.frag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tablayout=findViewById(R.id.tabBar);
        TabItem tabChats=findViewById(R.id.TabChats);
        TabItem tabCalls=findViewById(R.id.TabCalls);
        TabItem tabStatus=findViewById(R.id.TabStatus);
        ViewPager viewPager=findViewById(R.id.viewpager);

        PagerAdapter pagerAdapter = new
                PagerAdapter(getSupportFragmentManager(),
                 tablayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);

        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}