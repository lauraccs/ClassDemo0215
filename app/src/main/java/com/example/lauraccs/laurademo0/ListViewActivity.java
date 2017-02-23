package com.example.lauraccs.laurademo0;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lauraccs.laurademo0.adapter.ListViewAdapter;
import com.example.lauraccs.laurademo0.adapter.ViewPagerAdapter;
import com.example.lauraccs.laurademo0.fragment.Pic1HeaderFragment;
import com.example.lauraccs.laurademo0.fragment.Pic2HeaderFragment;
import com.example.lauraccs.laurademo0.fragment.Pic3HeaderFragment;
import com.example.lauraccs.laurademo0.fragment.Pic4HeaderFragment;
import com.example.lauraccs.laurademo0.fragment.Pic5HeaderFragment;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{


    private ListView listView;
    private ArrayList<String> listResult;
    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listResult = new ArrayList<String>();
        createFakeResult();
        initialView();



    }

//    private void setHeaderPager() {
//        viewPager = (ViewPager) findViewById(R.id.list_view_pager);
//        fragmentList.add(new Pic1HeaderFragment());
//        fragmentList.add(new Pic2HeaderFragment());
//        fragmentList.add(new Pic3HeaderFragment());
//
//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
//        viewPagerAdapter.setContent(fragmentList);
//        viewPager.setAdapter(viewPagerAdapter);
//    }

    private void createFakeResult(){
        listResult.add("AAAAAAAAAA");
        listResult.add("BBBBBBB");
        listResult.add("CDDDD");
        listResult.add("DDDDDDDDDDD");
        listResult.add("EE");
        listResult.add("FF");
        listResult.add("GGG");
        listResult.add("H");
        listResult.add("I");
        listResult.add("J");
        listResult.add("K");
        listResult.add("L");
        listResult.add("M");
        listResult.add("N");
        listResult.add("O");
        listResult.add("P");
        listResult.add("Q");



    }

    private void initialView() {


        listView = (ListView) findViewById(R.id.list_view);
        View view = getLayoutInflater().inflate(R.layout.list_view_header,null);

        LinearLayout listViewHeader = (LinearLayout)view.findViewById(R.id.list_view_header);

        viewPager = (ViewPager) view.findViewById(R.id.header_view_pager);
        fragmentList.add(new Pic1HeaderFragment());
        fragmentList.add(new Pic2HeaderFragment());
        fragmentList.add(new Pic3HeaderFragment());
        fragmentList.add(new Pic4HeaderFragment());
        fragmentList.add(new Pic5HeaderFragment());


        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        viewPager.setAdapter(viewPagerAdapter);


        ListViewAdapter listViewAdapter = new ListViewAdapter(this,listResult);
        listView.addHeaderView(listViewHeader);

        TextView tv = new TextView(this);
        tv.setText("We have no more content");
        tv.setTextSize(28);
        tv.setGravity(Gravity.CENTER);
        listView.addFooterView(tv);

        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(this);


        final DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        final int width = displayMetrics.widthPixels;


        AbsListView.LayoutParams headerViewParams = new AbsListView.LayoutParams(width, 300);
        listViewHeader.setLayoutParams(headerViewParams);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"listView was clicked at position:"+ position,Toast.LENGTH_LONG).show();
        Log.d("testListViewActivity",String.valueOf(position));
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("message", "ListView");
        setResult(RESULT_OK, intent);
        super.onBackPressed();
    }
}
