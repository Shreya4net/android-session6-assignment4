package com.dce.puja.tabs;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ActionBar;


/**
 * Created by Devendra on 4/29/2017.
 */

public class Tablistener  implements ActionBar.TabListener{
        Fragment fragment;

public Tablistener (Fragment fragment) {
        // TODO Auto-generated constructor stub
        this.fragment = fragment;
        }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        ft.replace(R.id.activity_main,fragment);
    }



@Override
public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        // TODO Auto-generated method stub
        ft.remove(fragment);
        }

@Override
public void onTabReselected(Tab tab, FragmentTransaction ft) {
    // TODO Auto-generated method stub


}}

