package com.dce.puja.tabs;
import android.app.ActionBar;
import android.app.Fragment;

import android.app.Activity;

import android.os.Bundle;

public class MainActivity extends Activity{
    ActionBar.Tab Tab1, Tab2;
    Fragment fragmentTab1 = new Tab1();
    Fragment fragmentTab2 = new Tab2();




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();


        actionBar.setDisplayShowHomeEnabled(false);


        actionBar.setDisplayShowTitleEnabled(false);

        // Create Actionbar Tabs
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        Tab1 = actionBar.newTab().setText("Audio");
        Tab2= actionBar.newTab().setText("Video");

        Tab1.setTabListener(new Tablistener(fragmentTab1));
        Tab2.setTabListener(new Tablistener(fragmentTab2));


        // Add tabs to actionbar
        actionBar.addTab(Tab1);
        actionBar.addTab(Tab2);
    }
}

