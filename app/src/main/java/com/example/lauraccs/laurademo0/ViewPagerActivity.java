package com.example.lauraccs.laurademo0;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
//import android.support.design.widget.TabLayout;

import com.example.lauraccs.laurademo0.adapter.ViewPagerAdapter;
import com.example.lauraccs.laurademo0.bean.Book;
import com.example.lauraccs.laurademo0.fragment.ContentFragment;
import com.example.lauraccs.laurademo0.fragment.HistoryFragment;
import com.example.lauraccs.laurademo0.fragment.LoginFragment;
import com.example.lauraccs.laurademo0.util.UtilLog;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

//    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String message = intent.getStringExtra("key");
        int number = bundle.getInt("Integer", 0);
        int fakeNumber = bundle.getInt("fake", 0);
        Book book = (Book) bundle.getSerializable("book");

        UtilLog.logD("ViewPagerActivity, value is: ", message);
        UtilLog.logD("ViewPagerActivity, number is: ", ""+number);
        UtilLog.logD("ViewPagerActivity, fake number is: " , String.valueOf(fakeNumber));
        UtilLog.logD("ViewPagerActivity, book author is:", book.getAuthor());
        initial();
    }

    private void initial(){
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        fragmentList.add(new LoginFragment());
        fragmentList.add(new ContentFragment());
        fragmentList.add(new HistoryFragment());
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        viewPager.setAdapter(viewPagerAdapter);

//        tabLayout = (TableLayout) findViewById(R.id.tab_layout);
//        tabLayout.setupWithViewPage(viewPager);

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("message", "ViewPager");
        setResult(RESULT_OK, intent);
        super.onBackPressed();

    }


}
