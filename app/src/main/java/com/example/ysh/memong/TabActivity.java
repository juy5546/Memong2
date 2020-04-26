package com.example.ysh.memong;

import android.app.ActivityGroup;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabActivity extends ActivityGroup {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        createTab();
    }
    private void createTab(){
        TabHost tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup(getLocalActivityManager());

        tabHost.addTab(tabHost.newTabSpec("TAB1").setIndicator("날짜별 다이어리")
        .setContent(new Intent(this, DateActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("TAB2").setIndicator("앨범")
        .setContent(new Intent(this, MainActivity.class)));
    }
}
