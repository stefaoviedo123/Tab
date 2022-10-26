package com.example.tab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;

import Controlador.PagerController;

public class MainActivity extends AppCompatActivity {

    TableLayout tableLayout;
    ViewPager viewPager;
    TabItem tab1,tab2,tab3;
    PagerController pagerAdapter;
    private Object PagerController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout = findViewById(R.id.tab);
        viewPager = findViewById((R.id.viewpager);

        tab1 = findViewById(R.id.contactos);
        tab2 = findViewById(R.id.correos);
        tab3 = findViewById(R.id.mensajes);
        PagerController = new PagerController(getSupportFragmentManager(), tableLayout.getX());
        viewPager.setAdapter(PagerAdapter);
        tableLayout.setTabSelectedListener(new TableLayout.onTabSelectedListener_(){

            @Override
            public void onTabUnSelected(TableLayout.Tab tab){
              viewPager.setCurrentItem(tab.getPosition());
            }
        }

    }
}