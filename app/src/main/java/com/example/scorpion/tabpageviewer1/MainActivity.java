package com.example.scorpion.tabpageviewer1;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity{

    Adapter adapter;
    ViewPager viewPager;
    PagerTabStrip pagerTabStrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter=new Adapter(getSupportFragmentManager());
        viewPager=findViewById(R.id.view_pager);
        pagerTabStrip=findViewById(R.id.pager_tab);
        pagerTabStrip.setDrawFullUnderline(false);
        viewPager.setAdapter(adapter);
    }
}
